package com.practice.service.impl;

import com.practice.dao.IUserDao;
import com.practice.model.User;
import com.practice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


    @Service("userService")
    public class UserServiceImpl implements IUserService {

        @Autowired
        private IUserDao userDao;

        public User selectUser(long userId) {
            return this.userDao.selectUser(userId);
        }

}
