/**
 * 
 */
package com.luxy.stu.entity;

/**
 * @classDesc:
 * @author: luxy
 * @creatTime:2019Äê10ÔÂ23ÈÕ
 * @email:luxy@primeton.com
 */
public class Student {
	
	private String id;
	private String name;
	
	/**
	 * @param id
	 * @param name
	 */
	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	

}
