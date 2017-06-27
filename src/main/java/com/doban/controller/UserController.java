package com.doban.controller;

import com.doban.domain.User;
import com.doban.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/6/9.
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "insert",method = RequestMethod.GET)
    @ResponseBody
    public String insert(User user) {
         this.userService.insetUser(user);
         return "OK";
    }

    @RequestMapping(value = "find",method = RequestMethod.GET)
    @ResponseBody
    public  String find(int id) {
        User u = this.userService.findUserById(id);
        System.err.println(u.toString());
        return "ok";
    }
}
