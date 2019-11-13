/**
 * 
 */
package com.luxy.stu.singleton;

/**
 * @classDesc: 懒汉式 线程不安全
 * @author: luxy
 * @createTime: 2019年11月12日
 * @email: luxy@primeton.com
 */
public class SingletonA {
	
    private static SingletonA instance;
	
	private SingletonA(){}
	
	public static SingletonA getInstance(){
		if(instance==null){
			instance=new SingletonA();
		}
		return instance;
	} 

}
