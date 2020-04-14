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

import com.pncaccount.model.SignUpModel;
import com.pncaccount.model.User;
import com.pncaccount.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<User> getAllUsers() {
        return this.userService.getAllUsers();
    }

    @RequestMapping(value = "/adduser", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody()
    public User addNewUser(@RequestBody User user) {
        return this.userService.addUser(user);
    }
    
    @RequestMapping(value = "/{accountid}", method = RequestMethod.GET)
    public User getSpecificUser(@PathVariable("accountid") Integer accountid){
    	int i=10;
    	return this.userService.getSpecificUser(accountid);
    }
    
    @RequestMapping(value = "/delete/{accountid}", method = RequestMethod.DELETE)
    public void deleteSpecificUser(@PathVariable("accountid") Integer accountid){
    	 this.userService.deleteSpecificUser(accountid);
    }
    
    @RequestMapping(value = "/update/{accountid}", method = RequestMethod.PUT)
    public void updateSpecificUser(@PathVariable("accountid") Integer accountid){
    	 this.userService.updateSpecificUser(accountid);
    }
    
  
//    ==========================Online Banking Services====================================
    
   /* @RequestMapping(value = "/signupuser", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    public String signIn(@RequestBody SignUpModel user){
    	 this.userService.signUp(user);
    	 return "Redirecting To Welcome Page : Successfully";
    }*/

//    @RequestMapping(value="/login",method=RequestMethod.GET,consumes=MediaType.APPLICATION_JSON_VALUE)
//    public String login(@RequestBody UserCredentials user){
//    	this.userService.loginCredentilas(user);
//    	return "Redirecting To Home Page : Successfully";
//    	
//    }
//    
    //other controllers omitted for brevity

}
