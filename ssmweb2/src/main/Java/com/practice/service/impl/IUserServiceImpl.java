package com.practice.service.impl;

import com.practice.dao.UserMapper;
import com.practice.pojo.User;
import com.practice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class IUserServiceImpl implements IUserService {
    @Resource
    private UserMapper userDao;



    public User getUserById(int userId) {
        // TODO Auto-generated method stub
        return this.userDao.selectByPrimaryKey(userId);
    }
}
