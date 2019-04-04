package com.itlzp;

import com.itlzp.dao.UserDao;
import com.itlzp.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Created by 罗忠鹏
 * @Date 2019/4/4 15:47
 * @Description TODO
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class test {

    public void test1(){
        User user = new User();
    }

    @Autowired
    UserDao userDao;


    @Test
    public void test(){
        System.out.println(userDao.getEntityManager());
    }
}
