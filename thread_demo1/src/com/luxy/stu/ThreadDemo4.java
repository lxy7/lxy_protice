/**
 * 
 */
package com.luxy.stu;

import java.util.MissingFormatArgumentException;

/**
 * @classDesc:�̳߳��õ�api
 * @author: luxy
 * @creatTime:2019��10��15��
 * @email:luxy@primeton.com
 */
public class ThreadDemo4 {
	public static void main(String[] args) {
		//���߳�id name
		System.out.println("���߳�id="+Thread.currentThread().getId()+"���߳�name="+Thread.currentThread().getName());
		//���߳����ָĳ��Լ����������
		Thread2 t2 = new Thread2();
		Thread t3= new Thread(t2,"�߳�luxy");//������
		t3.setDaemon(true);//���ø��߳�Ϊ�ػ��̣߳������߳�һ������
	    t3.start();
		for (int i = 0; i < 3; i++) {//3���߳�
			Thread1 t1= new Thread1();
			t1.start();
		}
		for (int i = 0; i < 3; i++) {
			System.out.println("�������߳�"+i);
		}
		System.out.println("���߳̽�����������");
		
	}

}
class Thread1 extends Thread{
	//getId() �߳�id,Ψһ
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);//����1��
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i==2){
				stop();//ֹͣ�̣߳�һ�㲻����ʹ��
			}
			System.out.println(getId()+"�߳�:"+i);
		}
	}
}

class Thread2 implements Runnable {
	public void run() {
		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep(3000);//����1��
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("��ǰ�̵߳�����"+Thread.currentThread().getName());
			System.out.println("�ػ��߳�-----"+i);
		}
		
	}
}
