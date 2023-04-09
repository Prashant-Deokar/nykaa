package com.nykaa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nykaa.model.Admin;

@Repository
public interface AdminDao extends JpaRepository<Admin, Integer> {
	
	Admin findByEmailidAndPassword(String emailId , String password);
	Admin findByEmailid(String emailId);

}
