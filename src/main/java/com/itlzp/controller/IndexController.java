package com.itlzp.controller;

import com.itlzp.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Created by 罗忠鹏
 * @Date 2019/4/4 15:24
 * @Description TODO
 */
@Controller
public class IndexController {

    @Autowired
    UserDao userDao;

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        System.out.println(userDao.getEntityManager());
        return "ok";
    }
}
