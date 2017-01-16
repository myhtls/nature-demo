package com.nature.service.dao;

import java.io.Serializable;

import javax.ejb.Singleton;

import org.nature.platform.core.entity.base.User;
import org.nature.platform.persistence.dao.BaseDaoImpl;

@Singleton
public class UserDao extends BaseDaoImpl<User, Serializable>{

}
