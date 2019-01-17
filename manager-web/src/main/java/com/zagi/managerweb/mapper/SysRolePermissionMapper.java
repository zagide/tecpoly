package com.zagi.managerweb.mapper;

import com.zagi.managerweb.pojo.SysRolePermission;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface SysRolePermissionMapper {
    int deleteByPrimaryKey(@Param("id") Long id, @Param("roleId") String roleId);

    int insert(SysRolePermission record);

    SysRolePermission selectByPrimaryKey(@Param("id") Long id, @Param("roleId") String roleId);

    List<SysRolePermission> selectAll();

    int updateByPrimaryKey(SysRolePermission record);
}