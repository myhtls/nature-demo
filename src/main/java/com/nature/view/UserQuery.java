package com.nature.view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;


import org.nature.platform.core.entity.base.User;
import org.nature.view.primefaces.model.LazyDataModelImpl;
import org.omnifaces.cdi.ViewScoped;

import com.nature.service.UserService;

@Named
@ViewScoped
public class UserQuery implements java.io.Serializable{
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

private LazyDataModelImpl<User> lazyDataModelImpl;
	
	private @Inject UserService userService;
	private List<User> result;
	
	@PostConstruct
	public void init(){
		System.err.println("userQuery init");
		lazyDataModelImpl = 
				new LazyDataModelImpl<>("userName",userService);
	}
	
	@PreDestroy
	public void destroy(){
		System.err.println("userQuery destroy");
	}
	
	public void search(){
		//JoinBuilder jb = new JoinBuilder("NEW org.nature.platform.core.entity.base.User(user.userName,user.lastName,user.userName,user.userProfileId)",true);
		//jb.innerJoin("user.userProfileId","userProfileId");
		//Restriction restriction = new Restriction("user",RestrictionType.LIKE,"myhtls",LikeType.BOTH);
		
		
		
//		result = userService.getQueryBuilder()
//				.select("NEW org.nature.platform.core.entity.base.User(user.userName,user.lastName,userProfileId)")
//				.from(User.class, "user")
//				.innerJoin("user.userProfileId","userProfileId")
//				.add(restriction).getResultList();
		
		
	}

	public LazyDataModelImpl<User> getLazyDataModelImpl() {
		return lazyDataModelImpl;
	}

	public List<User> getResult() {
		return result;
	}
	

}
