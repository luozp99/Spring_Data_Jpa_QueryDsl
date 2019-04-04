package com.itlzp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @Created by 罗忠鹏
 * @Date 2019/4/4 16:02
 * @Description TODO
 */
@Component
public class UserDao {

    @Autowired
    protected EntityManager entityManager;

    public EntityManager getEntityManager(){
        return entityManager;
    }
}
