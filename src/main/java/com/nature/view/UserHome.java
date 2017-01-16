package com.nature.view;

import javax.enterprise.context.ConversationScoped;
import javax.inject.Named;

import org.nature.platform.core.entity.base.User;
import org.nature.platform.enums.StatusCode;
import org.nature.platform.persistence.dao.BaseDao;
import org.nature.platform.persistence.home.AbstractEntityHome;

@Named
@ConversationScoped
public class UserHome extends AbstractEntityHome<User, Long> implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void inserts(){
		System.err.println("123");
	}
	
	@Override
	protected void doPreInitData() {
		System.err.println("init data");
	}



	@Override
	protected User doLoadEntity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseDao<User, Long> getBaseDao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected StatusCode doInsert() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected StatusCode doUpdate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected StatusCode doDelete() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	

}
