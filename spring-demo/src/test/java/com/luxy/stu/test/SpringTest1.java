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
		
		//有参构造
		User user2 = (User) applicationContext.getBean("user2");
		System.out.println("id = "+user2.getId()+" name = "+user2.getName()+"   password = "+user2.getPassword());
		

	}

}
