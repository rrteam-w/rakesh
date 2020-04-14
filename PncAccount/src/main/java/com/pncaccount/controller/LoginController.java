package com.pncaccount.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pncaccount.model.User;
import com.pncaccount.service.UserService;

@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
    UserService userService;
	
	@RequestMapping(value = "/{username}/{password}", method = RequestMethod.GET)
    public boolean login(@PathVariable("username") String username,@PathVariable("password") String password ){
		
		boolean result = this.userService.findByUsername(username,password);
		
		return result;
    }
	
	
	
}
