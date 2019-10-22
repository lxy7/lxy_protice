package com.luxy.stu;

/**
 * @classDesc:3种不同方式创建线程,指定线程执行顺序为t3>t2>t1
 * @author: luxy
 * @creatTime:2019年10月22日
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
					System.out.println("线程T3########"+i);
					
				}
				
			}
		});	
		t3.start();
		//join():让主线程等待子线程运行结束才继续运行
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
			System.out.println("线程T1-------"+i);
			
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
			System.out.println("线程T2********"+i);
			
		}
	}
	
}
