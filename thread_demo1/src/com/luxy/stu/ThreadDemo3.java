/**
 * 
 */
package com.luxy.stu;

/**
 * @classDesc:�����ڲ��ഴ�����߳�
 * @author: luxy
 * @creatTime:2019��10��15��
 * @email:luxy@primeton.com
 */
public class ThreadDemo3 {
	
	public static void main(String[] args) {
		Thread t1=new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < 30; i++){
					System.out.println("�����ڲ������߳� i="+i);
				}
				
			}
		});
		t1.start();
		for(int i = 0; i < 30; i++){
			System.out.println("���߳� i="+i);
		}
	}

}


		

