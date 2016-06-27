package com.helper.base.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import com.helper.base.model.User;

@Service
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class BaseService {

	private static final Logger log = LoggerFactory.getLogger(BaseService.class);

	@Autowired
	@Qualifier("UserConverter")
	private UserConverter userConverter;

	private User user;

	public void inputUser(User user) {
		this.user = user;
	}

	public String getName() {
		return user.getName();
	}

	public String getId() {
		log.info("user:{}", user);
		userConverter.converter(user);
		return user.getId();
	}

}
