package com.pncaccount.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pncaccount.model.SignUpModel;
import com.pncaccount.service.UserService;

@RestController
@RequestMapping("/signup")
public class SignUpController {
	
	@Autowired
    UserService userService;

	   @RequestMapping(value = "/signupuser", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	    public String signIn(@RequestBody SignUpModel user){
	    	 this.userService.signUp(user);
	    	 return "Redirecting To Login Page (Start Login)";
	    }

	
}

