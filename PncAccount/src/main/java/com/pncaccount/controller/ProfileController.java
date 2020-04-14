package com.pncaccount.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pncaccount.model.User;
import com.pncaccount.service.UserService;

@RestController
@RequestMapping("/profile")
public class ProfileController {
	
    @Autowired
    UserService userService;
    
    /*
     * 1.allCustomer
     * 2.saveCustomer
     * 3.findCustomer
     * 4.verifyCustomer
     * *
     */

    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public List<User> allCustomer() {
        return this.userService.getAllUsers();
    }
    
    @RequestMapping(value = "/saveuser", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody()
    public User saveCustomer(@RequestBody User user) {
        return this.userService.addUser(user);
    }
    
    @RequestMapping(value = "/{accountid}", method = RequestMethod.GET)
    public User findCustomer(@PathVariable("accountid") Integer accountid){
    	return this.userService.getSpecificUser(accountid);
    } 
    
    @RequestMapping(value = "/verify/{accountid}", method = RequestMethod.GET)
    public boolean verifyCustomer(@PathVariable("accountid") Integer accountid){
    
    	boolean verified = this.userService.verifyCustomer(accountid);
    	return verified;
    }

}
