/**
 * 
 */
package com.luxy.stu.service;

import com.luxy.stu.dao.UserDao;

/**
 * @classDesc: 
 * @author: luxy
 * @createTime: 2020年1月16日
 * @email: luxy@primeton.com
 */
public class UserService {
	
	private UserDao userDao;
	
	
	
	
	/**
	 * @return the userDao
	 */
	public UserDao getUserDao() {
		return userDao;
	}


	/**
	 * @param userDao the userDao to set
	 */
	public void setUserDao(UserDao userDao) {
		System.out.println("setting");
		this.userDao = userDao;
	}
	
	public void add(){
		userDao.add();
		System.out.println("I'am UserService");
	}


}
