/**
 * 
 */
package com.luxy.stu;

/**
 * @classDesc:ʵ��runnable�������߳�
 * @author: luxy
 * @creatTime:2019��10��15��
 * @email:luxy@primeton.com
 */
public class ThreadDemo2 {
	
	public static void main(String[] args) {
		CreateThreadDemo2 thread= new CreateThreadDemo2();
		Thread t1=new Thread(thread);
		t1.start();
		for(int i = 0; i < 30; i++){
			System.out.println("���߳� i="+i);
		}
	}

}

/**
 * 2.ʵ��runnable�ӿ�
 * run()����Ϊ�߳���Ҫִ�е�����*/
class CreateThreadDemo2 implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i < 30; i++){
			System.out.println("���߳� i="+i);
		}
		
	}
}
		

