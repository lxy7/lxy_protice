/**
 * 
 */
package com.luxy.stu.strategy;

/**
 * @classDesc: 
 * @author: luxy
 * @createTime: 2019��11��14��
 * @email: luxy@primeton.com
 */
public class Main {
	public static void main(String[] args) {
		
		double price=1000;
		Context context= new Context(new User());//��ͨ�û�
		System.out.println("��ͨ�û� = "+context.getPrice(price));
		
		context=new Context(new Member());//��Ա
		System.out.println("��ͨ��Ա = "+context.getPrice(price));
		
		context=new Context(new SuperMember());//������Ա
		System.out.println("������Ա = "+context.getPrice(price));
		
		
	}

}
