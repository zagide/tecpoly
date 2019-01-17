package com.zagi.managerweb.mapper;

import com.zagi.managerweb.pojo.SysUserRole;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.Mapper;

@Component
public interface SysUserRoleMapper extends Mapper<SysUserRole> {

}