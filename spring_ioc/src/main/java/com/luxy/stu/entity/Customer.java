/**
 * 
 */
package com.luxy.stu.entity;

/**
 * @classDesc: 
 * @author: luxy
 * @createTime: 2019Äê11ÔÂ12ÈÕ
 * @email: luxy@primeton.com
 */
public class Customer {
	
	private String cId;
	private String cName;
	/**
	 * @return the cId
	 */
	public String getcId() {
		return cId;
	}
	/**
	 * @param cId the cId to set
	 */
	public void setcId(String cId) {
		this.cId = cId;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", cName=" + cName + "]";
	}

}
