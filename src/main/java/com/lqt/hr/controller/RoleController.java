package com.lqt.hr.controller;

import com.lqt.hr.common.utils.RespMessage;
import com.lqt.hr.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("role")
public class RoleController {

    @Autowired
    private IRoleService roleService;

    @GetMapping("roles")
    public RespMessage getRoles(){
        List<Role> roles = roleService.getRoles();
        return RespMessage.success(roles);
    }

    @GetMapping("role")
    public RespMessage getRole(@RequestParam("id")Integer id){
        Role role = roleService.getRole(id);
        return RespMessage.success(role);
    }

}
