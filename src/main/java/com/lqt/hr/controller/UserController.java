package com.lqt.hr.controller;

import com.lqt.hr.common.utils.RespMessage;
import com.lqt.hr.model.User;
import com.lqt.hr.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("insert")
    public RespMessage insert(@RequestParam(value = "name")String name,
                              @RequestParam(value = "password")String password,
                              @RequestParam(value = "roleId")Integer roleId,
                              @RequestParam(value = "roleName", required = false)String roleName,
                              @RequestParam(value = "eId", required = false)Integer eid){
        System.out.println("user/insert");
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        user.setRoleId(roleId);
        user.setRoleName(roleName);
        user.seteId(eid);
        try {
            int id = userService.insert(user);
            Map<String, Integer> map = new HashMap<String, Integer>();
            map.put("id", id);
            return RespMessage.success(map);
        }catch (Exception e){
            e.printStackTrace();
            return RespMessage.fail("error");
        }
    }

    /*@PostMapping("insert")
    public RespMessage insert(User user){
        System.out.println("user/insert");
        try {
            int id = userService.insert(user);
            Map<String, Integer> map = new HashMap<String, Integer>();
            map.put("id", id);
            return RespMessage.success(map);
        }catch (Exception e){
            e.printStackTrace();
            return RespMessage.fail("error");
        }
    }*/

    @GetMapping("/getUsers")
    public RespMessage getUsers(){
        System.out.println("user/getUsers");
        List<User> users = userService.selectList();
        return RespMessage.success(users);
    }

    @GetMapping("/getUser")
    public RespMessage getUser(@RequestParam("id")Integer id){
        System.out.println("user/getUser");
        User user = userService.select(id);
        return RespMessage.success(user);
    }

    @GetMapping("/getUsersByName")
    public RespMessage getUsersByName(@RequestParam("name")String name){
        System.out.println("user/getUsersByName");
        List<User> users = userService.selectListByName(name);
        return RespMessage.success(users);
    }

    @GetMapping("/delete")
    public RespMessage deleteUser(@RequestParam("id")Integer id){
        System.out.println("user/delete");
        try {
            userService.delete(id);
            return RespMessage.SUCCESS;
        } catch (Exception e){
            e.printStackTrace();
            return RespMessage.fail("error");
        }

    }

    @GetMapping("/update")
    public RespMessage updateUser(@RequestParam(value = "id")Integer id,
                                  @RequestParam(value = "name", required = false)String name,
                                  @RequestParam(value = "password", required = false)String password,
                                  @RequestParam(value = "roleName", required = false)String roleName,
                                  @RequestParam(value = "roleId", required = false)Integer roleId,
                                  @RequestParam(value = "eId", required = false)Integer eId){
        System.out.println("user/update");
        User user = new User(id, name, password, roleId, roleName, eId);
        try {
            userService.update(user);
            return RespMessage.SUCCESS;
        }catch (Exception e){
            e.printStackTrace();
            return RespMessage.fail("error");
        }

    }

    @GetMapping("login")
    public RespMessage login(@RequestParam("name")String name,
                             @RequestParam("password")String password){
        System.out.println("user/login");
        //todo 判断登陆，登陆成功后返回roleId


        return RespMessage.success(null);
    }
}
