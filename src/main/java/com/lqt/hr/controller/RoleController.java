package com.lqt.hr.controller;

import com.lqt.hr.common.utils.RespMessage;
import com.lqt.hr.model.Role;
import com.lqt.hr.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("role")
public class RoleController {

    @Autowired
    private IRoleService roleService;

    @GetMapping("roles")
    public RespMessage getRoles() {
        System.out.println("role/roles");
        List<Role> roles = roleService.getRoles();
        return RespMessage.success(roles);
    }

    @GetMapping("role")
    public RespMessage getRole(@RequestParam("id") Integer id) {
        System.out.println("role/role");
        Role role = roleService.getRole(id);
        return RespMessage.success(role);
    }

    @GetMapping("getByName")
    public RespMessage getRoleByName(@RequestParam("name") String name) {
        System.out.println("role/getByName");
        List<Role> roles = roleService.getRoleByName(name);
        return RespMessage.success(roles);
    }

    @GetMapping("insert")
    public RespMessage insert(@RequestParam(value = "name") String name,
                              @RequestParam(value = "level", required = false) Integer level,
                              @RequestParam(value = "description", required = false) String description) {
        System.out.println("role/insert");
        Role role = new Role();
        role.setName(name);
        role.setLevel(level);
        role.setDescription(description);
        try {
            int id = roleService.insert(role);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("id", id);
            return RespMessage.success(map);
        } catch (Exception e) {
            e.printStackTrace();
            return RespMessage.fail("error");
        }
    }

    @GetMapping("update")
    public RespMessage update(@RequestParam(value = "id") Integer id,
                              @RequestParam(value = "name") String name,
                              @RequestParam(value = "level", required = false) Integer level,
                              @RequestParam(value = "description",required = false) String description) {
        System.out.println("role/update");
        Role role = new Role(id, name, level, description);
        try {
            roleService.update(role);
            return RespMessage.SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return RespMessage.fail("error");
        }
    }

    @GetMapping("delete")
    public RespMessage delete(@RequestParam("id") Integer id) {
        System.out.println("role/delete");
        try {
            roleService.delete(id);
            return RespMessage.SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return RespMessage.fail("error");
        }
    }

}
