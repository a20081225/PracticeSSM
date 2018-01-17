package com.practice.dao;

import com.practice.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration({"classpath:spring-mybatis.xml"})
    public class UserTest {

        @Autowired
        private IUserDao userdao;

        @Test
        public void testSelectUser() throws Exception {
            long id = 1;
            User user = userdao.selectUser(id);
            System.out.println(user.getUsername());
        }

    }
