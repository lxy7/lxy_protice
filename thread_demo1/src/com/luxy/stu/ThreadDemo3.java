/**
 * 
 */
package com.luxy.stu;

/**
 * @classDesc:匿名内部类创建多线程
 * @author: luxy
 * @creatTime:2019年10月15日
 * @email:luxy@primeton.com
 */
public class ThreadDemo3 {
	
	public static void main(String[] args) {
		Thread t1=new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < 30; i++){
					System.out.println("匿名内部类子线程 i="+i);
				}
				
			}
		});
		t1.start();
		for(int i = 0; i < 30; i++){
			System.out.println("主线程 i="+i);
		}
	}

}


		

