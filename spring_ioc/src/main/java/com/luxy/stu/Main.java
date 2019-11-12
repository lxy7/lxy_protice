/**
 * 
 */
package com.luxy.stu;

/**
 * @classDesc: 功能入口
 * @author: luxy
 * @createTime: 2019年11月12日
 * @email: luxy@primeton.com
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClassPathXmlApplicationContext a=new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println(a.getBean("customer").toString());
		System.out.println(a.getBean("user").toString());
		
		}
	

}
