/**
 * 
 */
package com.luxy.stu;

/**
 * @classDesc: �������
 * @author: luxy
 * @createTime: 2019��11��12��
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
