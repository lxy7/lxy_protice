/**
 * 
 */
package com.luxy.stu;

/**
 * @classDesc:�̳�Thread�ഴ�����߳�
 * @author: luxy
 * @creatTime:2019��10��15��
 * @email:luxy@primeton.com
 */
public class ThreadDemo1 {
	/**
	 * �������̷߳�ʽ
	 * 1.�̳�thread��
	 * 2.ʵ��runable�ӿ�
	 * 3.�����ڲ���
	 * 4.callable
	 * 5.�̳߳ش����߳�
	 */
	public static void main(String[] args) {
		CreateThreadDemo1 thread= new CreateThreadDemo1();
		//�����̲߳��ǵ���run�������ǵ���start����
		//ʹ�ö��̣߳����벻���������ִ��,����ִ�С�
		thread.start();
		for(int i = 0; i < 30; i++){
			System.out.println("main i="+i);
		}
	}
}


/**
 * 1.�̳�thread��
 * run()����Ϊ�߳���Ҫִ�е�����*/
class CreateThreadDemo1 extends Thread{
	
	@Override
	public void run(){
		for(int i = 0; i < 30; i++){
			System.out.println("run i="+i);
		}
	}
}
