package com.pncaccount.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pncaccount.dao.CustomerDao;
import com.pncaccount.service.UserService;

@RestController
@RequestMapping("/accountdetails")
public class AccountController {
	
	@Autowired
    UserService userService;
	
	/*
     * 1.withdrawAmount
     * 2.depositAmount
     * 3.totalBalance
     * 
     */
	
	@RequestMapping(value = "/withdraw/{accountid}/{withdrawAmount}", method = RequestMethod.PUT)
	public void withdrawAmount(@PathVariable("accountid") Integer accountid,
			@PathVariable("withdrawAmount") Integer withdrawAmount) {
		System.out.println("AccountController = withdrawAmount api calleed");
		this.userService.withdrawAmount(accountid, withdrawAmount);
	}
	
	@RequestMapping(value = "/deposit/{accountid}/{depositAmount}", method = RequestMethod.PUT)
	public void depositAmount(@PathVariable("accountid") Integer accountid,
			@PathVariable("depositAmount") Integer depositAmount) {
		System.out.println("AccountController = withdrawAmount api calleed");
		this.userService.depositAmount(accountid, depositAmount);
	}
	
	@RequestMapping(value = "/balance/{accountid}", method = RequestMethod.GET)
	public Integer totalBalance(@PathVariable("accountid")Integer accountid){
		Integer totalBalance = this.userService.totalBalance(accountid);
		System.out.println("Total Balance ==================> "+totalBalance);
		return totalBalance;
	}
	
}
