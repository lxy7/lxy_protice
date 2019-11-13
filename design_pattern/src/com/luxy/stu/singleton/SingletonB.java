/**
 * 
 */
package com.luxy.stu.singleton;

/**
 * @classDesc: ����ʽ �̰߳�ȫ
 * @author: luxy
 * @createTime: 2019��11��12��
 * @email: luxy@primeton.com
 */
public class SingletonB {
	
	private static SingletonB instance=new SingletonB();//�����ʱ���Ѿ���ʼ��������
	
	private SingletonB(){}
	
	public static SingletonB getInstance(){
		return instance;
	}

}
