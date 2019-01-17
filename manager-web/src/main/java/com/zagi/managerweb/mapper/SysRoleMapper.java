package com.zagi.managerweb.mapper;

import com.zagi.managerweb.pojo.SysRole;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface SysRoleMapper {
    int deleteByPrimaryKey(@Param("id") Short id, @Param("roleId") String roleId);

    int insert(SysRole record);

    SysRole selectByPrimaryKey(@Param("id") Short id, @Param("roleId") String roleId);

    List<SysRole> selectAll();

    int updateByPrimaryKey(SysRole record);
}