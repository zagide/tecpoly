package com.zagi.managerweb.mapper;

import com.zagi.managerweb.pojo.SysPermission;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

@Component
public interface SysPermissionMapper extends Mapper<SysPermission> {
    int deleteByPrimaryKey(@Param("id") Short id, @Param("permissionId") String permissionId);

    int insert(SysPermission record);

    SysPermission selectByPrimaryKey(@Param("id") Short id, @Param("permissionId") String permissionId);

    List<SysPermission> selectAll();

    int updateByPrimaryKey(SysPermission record);
}