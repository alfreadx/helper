package com.helper.base.webapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.helper.base.model.User;
import com.helper.base.service.BaseService;

@RestController
@RequestMapping("/base")
public class BaseController {

	private final static Logger log = LoggerFactory.getLogger(BaseController.class);
	
	@Autowired
	private BaseService baseSvc;
	
	
	@RequestMapping("/")
	public String defaultResponse(){
		return "input base name";
	}
	
	@RequestMapping("/{name}")
	public String input(
			@PathVariable String name
			){
		log.info("enter input(),name:{}",name);
		
		User user = new User();
		user.setName(name);
		
		baseSvc.inputUser(user);
		
		String id = baseSvc.getId(); 
		log.info("return user:{}",user);
//		log.info("baseSvc instance:{}",baseSvc);
		return id;
	}
	
}
