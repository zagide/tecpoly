package com.zagi.managerweb.service.impl;

import com.zagi.managerweb.mapper.SysUserRoleMapper;
import com.zagi.managerweb.pojo.SysUser;
import com.zagi.managerweb.pojo.SysUserRole;
import com.zagi.managerweb.service.SysUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserRoleServiceImpl implements SysUserRoleService {

    @Autowired
    private SysUserRoleMapper userRoleMapper;

    @Override
    public SysUserRole getById(String id) {
        return userRoleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(String id, SysUserRole sysUserRole) {
        return 0;
    }

    @Override
    public List<SysUserRole> getUserRoleList(String userId) {
        SysUserRole userRole = new SysUserRole();
        userRole.setUserId(userId);
        return userRoleMapper.select(userRole);
    }
}
