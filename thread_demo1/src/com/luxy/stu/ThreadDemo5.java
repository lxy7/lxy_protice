package com.luxy.stu;

/**
 * @classDesc:3�ֲ�ͬ��ʽ�����߳�,ָ���߳�ִ��˳��Ϊt3>t2>t1
 * @author: luxy
 * @creatTime:2019��10��22��
 * @email:luxy@primeton.com
 */
public class ThreadDemo5 {
	public static void main(String[] args) {
		ThreadA t1=new ThreadA();
		ThreadB ti=new ThreadB();
		Thread t2=new Thread(ti);
		Thread t3=new Thread(new Runnable() {
			
			public void run() {
				for (int i = 0; i < 20; i++) {
					System.out.println("�߳�T3########"+i);
					
				}
				
			}
		});	
		t3.start();
		//join():�����̵߳ȴ����߳����н����ż�������
		try {
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.start();	
	}

}

class ThreadA extends Thread{

	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 20; i++) {
			System.out.println("�߳�T1-------"+i);
			
		}
	}
	
}

class ThreadB implements Runnable {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 20; i++) {
			System.out.println("�߳�T2********"+i);
			
		}
	}
	
}
