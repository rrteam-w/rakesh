package com.pncaccount.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pncaccount.model.SignUpModel;
import com.pncaccount.model.User;

@Repository
public interface CustomerDao extends JpaRepository<SignUpModel, Integer>{
	
	public SignUpModel findByUsername(String username);

}
