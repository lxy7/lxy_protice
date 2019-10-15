/**
 * 
 */
package com.luxy.stu;

/**
 * @classDesc:实现runnable创建多线程
 * @author: luxy
 * @creatTime:2019年10月15日
 * @email:luxy@primeton.com
 */
public class ThreadDemo2 {
	
	public static void main(String[] args) {
		CreateThreadDemo2 thread= new CreateThreadDemo2();
		Thread t1=new Thread(thread);
		t1.start();
		for(int i = 0; i < 30; i++){
			System.out.println("主线程 i="+i);
		}
	}

}

/**
 * 2.实现runnable接口
 * run()方法为线程需要执行的任务*/
class CreateThreadDemo2 implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i < 30; i++){
			System.out.println("子线程 i="+i);
		}
		
	}
}
		

