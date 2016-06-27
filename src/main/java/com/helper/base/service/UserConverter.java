package com.helper.base.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.helper.base.model.User;

@Service("UserConverter")
public class UserConverter {
	
	private static final Logger log = LoggerFactory.getLogger(UserConverter.class);
	
	public void converter(User user){
		String name = user.getName();
		String id = name.hashCode() + "abcdefg";
		log.info("after convert name:{},id:{}",name,id);
		user.setId(id);
	}

}
