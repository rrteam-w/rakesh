package com.pncaccount.service;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pncaccount.dao.UserDao;
import com.pncaccount.model.User;

@Service
public class UserService {
    @Autowired
    UserDao userDao;
    
    @Autowired
    DataSource dataSource;

    public List<User> getAllUsers() {
        return this.userDao.findAll();
    }

    public User addUser(User user) {
        return this.userDao.saveAndFlush(user);
    }
    
    public User getSpecificUser(Integer	accountid) {
        return this.userDao.findOne(accountid);
    }
   
    //other methods omitted for brevity
}