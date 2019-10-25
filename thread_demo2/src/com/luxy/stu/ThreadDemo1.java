/**
 * 
 */
package com.luxy.stu;

/**
 * @classDesc:多线程模拟抢票操作
 * @author: luxy
 * @creatTime:2019年10月24日
 * @email:luxy@primeton.com
 */
public class ThreadDemo1 {
	public static void main(String[] args) {
		Thread1 thread=new Thread1();
		Thread t1=new Thread (thread,"窗口①");
		Thread t2 = new Thread(thread,"窗口②");//new一次，共享资源
		t1.start();
		t2.start();
	}

}

class Thread1 implements Runnable {
	private int count=100;//初始化票数
    private Object Object=new Object();
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(count>0){
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//同步代码块方法
			//sale();
			//同步函数方法
			sale2();
		}
		
	}
	
	//同步代码块解决线程安全问题
	public void sale(){
		synchronized (Object) {
			if(count>0){
				int num=100-count+1;//当前出售的票序号
				System.out.println("Thread-----"+Thread.currentThread().getName()+"出售第"+num+"张票");
				count--;	
			}else{
				System.out.println("Thread-----"+Thread.currentThread().getName()+"票已售空！");
			}	
		}
		
	}
	//同步函数
	public synchronized void sale2() {
		if(count>0){
			int num=100-count+1;//当前出售的票序号
			System.out.println("Thread-----"+Thread.currentThread().getName()+"出售第"+num+"张票");
			count--;	
		}else{
			System.out.println("Thread-----"+Thread.currentThread().getName()+"票已售空！");
		}	
		
	}
	
}
