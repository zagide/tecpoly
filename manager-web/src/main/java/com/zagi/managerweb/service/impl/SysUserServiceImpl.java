package com.zagi.managerweb.service.impl;

import com.zagi.managerweb.mapper.SysUserMapper;
import com.zagi.managerweb.pojo.SysUser;
import com.zagi.managerweb.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper userMapper;

    @Override
    public SysUser getById(String id) {
        SysUser sysUser = userMapper.selectByPrimaryKey(id);
        return sysUser;
    }

    @Override
    public int updateById(String id, SysUser sysUser) {
        Example example = new Example(SysUser.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userId", id);

        return userMapper.updateByExampleSelective(sysUser, example);
    }
}
