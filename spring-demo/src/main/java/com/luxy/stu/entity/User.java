/**
 * 
 */
package com.luxy.stu.entity;

/**
 * @classDesc: 
 * @author: luxy
 * @createTime: 2020年01月08日
 * @email: luxy@primeton.com
 */
public class User {
	private String id;
	private String name;
	private String password;
	
	
	/**
	 * 
	 */
	public User() {
		System.out.println("无参构造方法！");
	}
	/**
	 * @param id
	 * @param name
	 * @param password
	 */
	public User(String id, String name, String password) {
		System.out.println("有参构造方法！");
		this.id = id;
		this.name = name;
		this.password = password;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
    
}
