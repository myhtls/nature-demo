package com.nature.vo;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class UserVo implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 605533843787335626L; 
	
	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	

}
