package com.zagi.managerweb.controller;

import com.zagi.managerweb.pojo.SysUser;
import com.zagi.managerweb.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SysUserController {

    @Autowired
    private SysUserService userService;

    @GetMapping("/user/{id}")
    public SysUser getUserById(@PathVariable(value = "id") String id) {
        return userService.getById(id);
    }

    @PutMapping("/user/{id}")
    public int updateUserById(@RequestParam SysUser user, @PathVariable("id") String id) {
        return userService.updateById(id, user);
    }
}
