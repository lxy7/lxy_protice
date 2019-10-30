/**
 * 
 */
package com.luxy.stu;

/**
 * @classDesc:
 * @author: luxy
 * @creatTime:2019年10月28日
 * @email:luxy@primeton.com
 */
public class ThreadVolatile {
	public static void main(String[] args) {
		TVolatile t1= new TVolatile();
		t1.start();
		try {
			t1.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("改变flag的值");
		t1.setFalg(false);
		try {
			t1.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("线程标志"+t1.getFalg());
	}

}

class TVolatile extends Thread{

	public volatile  Boolean falg=true;//volatile 刷新该变量的值，具有可见性
	private int count=0;
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("线程开始执行-----");
		while(falg){
			count++;
			System.out.println(count);
		}
		System.out.println("线程结束啦,执行循环次数="+this.count);
	}
	/**
	 * @return the falg
	 */
	public Boolean getFalg() {
		return falg;
	}
	/**
	 * @param falg the falg to set
	 */
	public void setFalg(Boolean falg) {
		this.falg = falg;
	}
	
}
