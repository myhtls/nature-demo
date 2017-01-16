package com.nature.service;

import java.io.Serializable;

import javax.ejb.Stateless;

import org.nature.platform.core.entity.base.User;
import org.nature.platform.persistence.dao.BaseDaoImpl;

@Stateless
public class UserService extends BaseDaoImpl<User, Serializable>{

}
