package com.helper.base.model;

import java.io.Serializable;

public class User implements Serializable{
	
	private static final long serialVersionUID = 1032333525904795144L;
	
	
	private String id;
	private String name;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return String.format("User [id=%s, name=%s]", id, name);
	}



}
