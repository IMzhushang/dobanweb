package com.doban.controller;

import com.doban.domain.Info;
import com.doban.domain.Type;
import com.doban.domain.User2;
import com.doban.domain.UserVo;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * Created by Administrator on 2017/6/8.
 */
@Controller
@RequestMapping("test")
public class TestController {
//    @RequestMapping("test")
//    @ResponseBody
//    public String test() {
//        return "test";
//    }


    @Autowired
    private Mapper mapper;
    /**
     * 跳转到新的layout
     *
     * @return
     */
    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String jump2() {
        return "index";
    }

    /**
     * 跳转到默认的layout
     *
     * @return
     */
    @RequestMapping(value = "jump2", method = RequestMethod.GET)
    public String jump() {
        return "jump";
    }

    /**
     * 跳转到没有layout的页面
     *
     * @return
     */
    @RequestMapping(value = "jump3", method = RequestMethod.GET)
    public String jump3() {
        return "test3";
    }

    @RequestMapping(value = "jump4", method = RequestMethod.GET)
    public String jump4() {
        return "test2";
    }

    @RequestMapping(value = "test1", method = RequestMethod.GET)
    public String test1(HttpServletRequest request, HttpSession session) {
        request.setAttribute("name", "request");
        //   session.setAttribute("name","zhushang");
        return "test4";
    }

    @RequestMapping(value = "test2", method = RequestMethod.GET)
    public String test2(HttpServletRequest request, HttpSession session) {
//        beanMapper.map();
        Info info  = new Info();
        info.setCreateTime(new Date());
        info.setId(20);
        info.setType(Type.man);

        User2 user = new User2();
        user.setId(100);
        user.setInfo(info);
        user.setName("zhushang朱");
        user.setPassword("123564");

        UserVo userVo = mapper.map(user, UserVo.class);
        System.err.println(userVo.toString());
        return "test4";
    }


}
