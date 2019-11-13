/**
 * 
 */
package com.luxy.stu.singleton;

/**
 * @classDesc: ����ʽ �̲߳���ȫ
 * @author: luxy
 * @createTime: 2019��11��12��
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
