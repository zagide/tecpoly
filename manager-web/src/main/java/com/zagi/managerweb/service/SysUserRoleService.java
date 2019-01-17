package com.zagi.managerweb.service;

import com.zagi.managerweb.pojo.SysUserRole;

import java.util.List;

public interface SysUserRoleService extends BaseService<SysUserRole>{

    List<SysUserRole> getUserRoleList(String userId);
}
