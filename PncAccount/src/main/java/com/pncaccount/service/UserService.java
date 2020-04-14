package com.pncaccount.service;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pncaccount.dao.CustomerDao;
import com.pncaccount.dao.PayeeDao;
import com.pncaccount.dao.UserDao;
import com.pncaccount.model.SignUpModel;
import com.pncaccount.model.User;

@Service
public class UserService {
    @Autowired
    UserDao userDao;
    
    @Autowired
	CustomerDao custDao;  // Login Data
    
    @Autowired
    PayeeDao payeeDao;
    
    @Autowired
    DataSource dataSource;
    
    public boolean findByUsername(String username,String password){
    	
    	SignUpModel model = this.custDao.findByUsername(username);
    	System.out.println(model);
    	if(model.getUsername().equals(username) && model.getPassword().equals(password)){
    		return true;
    	}else{
    		return false;
    	}
    }

    public List<User> getAllUsers() {
        return this.userDao.findAll();
    }

    public User addUser(User user) {
        return this.userDao.saveAndFlush(user);
    }
    
    public User getSpecificUser(Integer	accountid) {
        return this.userDao.findOne(accountid);
    }
    
    public void deleteSpecificUser(Integer	accountid) {
    	this.userDao.delete(accountid);
    }
    
    public void updateSpecificUser(Integer	accountid) {
         this.userDao.getOne(accountid);
    }
    
    public boolean verifyCustomer(Integer accountid){
    	
    	try{
    		
    		User user = this.userDao.getOne(accountid);
        	
        	if(user!=null && user.getAccountid()==accountid)
        		return true;
        	else
        		return false;
        		
    	}catch(Exception ex){
    		return false;
    	}
    }
    
    
    public void withdrawAmount(Integer accountid,Integer withdrawAmount){
    	
    	User user = this.userDao.getOne(accountid);
    	Integer balance_amount = user.getBalance()-withdrawAmount;
    	user.setBalance(balance_amount);
    	this.userDao.saveAndFlush(user);
    	System.out.println(user);
    }
    
    public void depositAmount(Integer accountid,Integer depositAmount){
    	
    	User user = this.userDao.getOne(accountid);
    	Integer main_balance = user.getBalance()+depositAmount;
    	user.setBalance(main_balance);
    	this.userDao.saveAndFlush(user);
    	System.out.println(user);
    }
    
    public Integer totalBalance(Integer accountid){
    	User user = this.userDao.getOne(accountid);
    	return user.getBalance();
    }
    
    public void signUp(SignUpModel userdetails) {
    	
    	this.custDao.saveAndFlush(userdetails);
    }
    
    
//    public UserCredentials loginCredentilas(SignUpModel userinfo) {
//    	return null;
//        
//    }
   
    //other methods omitted for brevity
}