/**
 * 
 */
package com.luxy.stu.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luxy.stu.entity.User;

/**
 * @classDesc: 
 * @author: luxy
 * @createTime: 2020年1月8日
 * @email: luxy@primeton.com
 */
public class SpringTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		User user = (User) applicationContext.getBean("user");
		user.setName("lili");
		user.setPassword("pas");
		System.out.println("name = "+user.getName()+"   password = "+user.getPassword());

	}

}
