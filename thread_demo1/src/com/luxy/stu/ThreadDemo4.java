/**
 * 
 */
package com.luxy.stu;

import java.util.MissingFormatArgumentException;

/**
 * @classDesc:线程常用的api
 * @author: luxy
 * @creatTime:2019年10月15日
 * @email:luxy@primeton.com
 */
public class ThreadDemo4 {
	public static void main(String[] args) {
		//主线程id name
		System.out.println("主线程id="+Thread.currentThread().getId()+"主线程name="+Thread.currentThread().getName());
		//将线程名字改成自己定义的名字
		Thread2 t2 = new Thread2();
		Thread t3= new Thread(t2,"线程luxy");//重命名
		t3.setDaemon(true);//设置该线程为守护线程，和主线程一起销毁
	    t3.start();
		for (int i = 0; i < 3; i++) {//3条线程
			Thread1 t1= new Thread1();
			t1.start();
		}
		for (int i = 0; i < 3; i++) {
			System.out.println("我是主线程"+i);
		}
		System.out.println("主线程结束啦啦啦啦");
		
	}

}
class Thread1 extends Thread{
	//getId() 线程id,唯一
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);//休眠1秒
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i==2){
				stop();//停止线程，一般不建议使用
			}
			System.out.println(getId()+"线程:"+i);
		}
	}
}

class Thread2 implements Runnable {
	public void run() {
		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep(3000);//休眠1秒
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("当前线程的名字"+Thread.currentThread().getName());
			System.out.println("守护线程-----"+i);
		}
		
	}
}
