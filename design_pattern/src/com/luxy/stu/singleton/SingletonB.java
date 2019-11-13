/**
 * 
 */
package com.luxy.stu.singleton;

/**
 * @classDesc: 饿汉式 线程安全
 * @author: luxy
 * @createTime: 2019年11月12日
 * @email: luxy@primeton.com
 */
public class SingletonB {
	
	private static SingletonB instance=new SingletonB();//编译的时候已经初始化对象了
	
	private SingletonB(){}
	
	public static SingletonB getInstance(){
		return instance;
	}

}
