/**
 * 
 */
package com.luxy.stu.singleton;

/**
 * @classDesc: 双重检验锁
 * @author: luxy
 * @createTime: 2019年11月12日
 * @email: luxy@primeton.com
 */
public class SingletonC {
	
	private static SingletonC instance;
	
	private SingletonC(){}
	
	public static SingletonC getInstance(){
		if(instance == null){//第一重锁
			synchronized (SingletonC.class) {
				if(instance == null){
					instance = new SingletonC();
				}
			}
			
		}
		return instance;
	}

}
