/**
 * 
 */
package com.luxy.stu.entity;

import java.util.List;

/**
 * @classDesc: 
 * @author: luxy
 * @createTime: 2019Äê11ÔÂ4ÈÕ
 * @email: luxy@primeton.com
 */
public class Grade {
	private String id;
	private String name;
	private String manager;
	private List<Classes> classesList;
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
	 * @return the manager
	 */
	public String getManager() {
		return manager;
	}
	/**
	 * @param manager the manager to set
	 */
	public void setManager(String manager) {
		this.manager = manager;
	}
	
	/**
	 * @return the classesList
	 */
	public List<Classes> getClassesList() {
		return classesList;
	}
	/**
	 * @param classesList the classesList to set
	 */
	public void setClassesList(List<Classes> classesList) {
		this.classesList = classesList;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Grade [id=" + id + ", name=" + name + ", manager=" + manager + ", classesList=" + classesList + "]";
	}
	
}
