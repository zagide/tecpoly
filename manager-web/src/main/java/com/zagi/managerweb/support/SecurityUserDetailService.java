package com.zagi.managerweb.support;

import com.zagi.managerweb.pojo.SysUser;
import com.zagi.managerweb.pojo.SysUserRole;
import com.zagi.managerweb.service.SysUserRoleService;
import com.zagi.managerweb.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SecurityUserDetailService implements UserDetailsService {

    @Autowired
    private SysUserService userService;
    @Autowired
    private SysUserRoleService userRoleService;

    @Override
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
        SysUser sysUser = userService.getById(userId);
        if (sysUser == null) {
            throw new UsernameNotFoundException(userId);
        }
        ArrayList<SimpleGrantedAuthority> auths = new ArrayList<>();
        List<SysUserRole> userRoleList = userRoleService.getUserRoleList(userId);
        for (SysUserRole role: userRoleList) {
            auths.add(new SimpleGrantedAuthority(role.getRoleId()));
        }
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodePassword = encoder.encode(sysUser.getPassword());
        System.out.println("load:" + sysUser.toString());
        return new User(sysUser.getUserName(), encodePassword, auths);
    }
}
