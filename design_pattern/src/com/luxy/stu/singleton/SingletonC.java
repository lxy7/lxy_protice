/**
 * 
 */
package com.luxy.stu.singleton;

/**
 * @classDesc: ˫�ؼ�����
 * @author: luxy
 * @createTime: 2019��11��12��
 * @email: luxy@primeton.com
 */
public class SingletonC {
	
	private static SingletonC instance;
	
	private SingletonC(){}
	
	public static SingletonC getInstance(){
		if(instance == null){//��һ����
			synchronized (SingletonC.class) {
				if(instance == null){
					instance = new SingletonC();
				}
			}
			
		}
		return instance;
	}

}
