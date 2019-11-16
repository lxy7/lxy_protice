/**
 * 
 */
package com.luxy.stu.strategy;

/**
 * @classDesc: 
 * @author: luxy
 * @createTime: 2019年11月14日
 * @email: luxy@primeton.com
 */
public class Main {
	public static void main(String[] args) {
		
		double price=1000;
		Context context= new Context(new User());//普通用户
		System.out.println("普通用户 = "+context.getPrice(price));
		
		context=new Context(new Member());//会员
		System.out.println("普通会员 = "+context.getPrice(price));
		
		context=new Context(new SuperMember());//超级会员
		System.out.println("超级会员 = "+context.getPrice(price));
		
		
	}

}
