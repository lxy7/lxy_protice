/**
 * 
 */
package com.luxy.stu;

/**
 * @classDesc:继承Thread类创建多线程
 * @author: luxy
 * @creatTime:2019年10月15日
 * @email:luxy@primeton.com
 */
public class ThreadDemo1 {
	/**
	 * 创建多线程方式
	 * 1.继承thread类
	 * 2.实现runable接口
	 * 3.匿名内部类
	 * 4.callable
	 * 5.线程池创建线程
	 */
	public static void main(String[] args) {
		CreateThreadDemo1 thread= new CreateThreadDemo1();
		//启动线程不是调用run方法而是调用start方法
		//使用多线程，代码不会从上往下执行,交替执行。
		thread.start();
		for(int i = 0; i < 30; i++){
			System.out.println("main i="+i);
		}
	}
}


/**
 * 1.继承thread类
 * run()方法为线程需要执行的任务*/
class CreateThreadDemo1 extends Thread{
	
	@Override
	public void run(){
		for(int i = 0; i < 30; i++){
			System.out.println("run i="+i);
		}
	}
}
