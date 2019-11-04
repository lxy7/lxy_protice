/**
 * 
 */
package com.luxy.stu.entity;

/**
 * @classDesc: 班级实体类
 * @author: luxy
 * @createTime: 2019年11月4日
 * @email: luxy@primeton.com
 */
public class Classes {
	private String classId;
	private String cName;
	private String cManager;
	/**
	 * @return the classId
	 */
	public String getClassId() {
		return classId;
	}
	/**
	 * @param classId the classId to set
	 */
	public void setClassId(String classId) {
		this.classId = classId;
	}
	/**
	 * @return the cName
	 */
	public String getcName() {
		return cName;
	}
	/**
	 * @param cName the cName to set
	 */
	public void setcName(String cName) {
		this.cName = cName;
	}
	/**
	 * @return the cManager
	 */
	public String getcManager() {
		return cManager;
	}
	/**
	 * @param cManager the cManager to set
	 */
	public void setcManager(String cManager) {
		this.cManager = cManager;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Classes [classId=" + classId + ", cName=" + cName + ", cManager=" + cManager + "]";
	}

}
