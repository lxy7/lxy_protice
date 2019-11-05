package com.luxy.stu.entity;

/**
 * @classDesc:
 * @author: luxy
 * @createTime: 2019Äê11ÔÂ5ÈÕ
 * @email: luxy@primeton.com
 */

public class Table {
	private String insertOrUpdate;
	private String delete;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInsertOrUpdate() {
		return insertOrUpdate;
	}

	public void setInsertOrUpdate(String insertOrUpdate) {
		this.insertOrUpdate = insertOrUpdate;
	}

	public String getDelete() {
		return delete;
	}

	public void setDelete(String delete) {
		this.delete = delete;
	}

}
