/**
 * 
 */
package com.luxy.stu;

/**
 * @classDesc:
 * @author: luxy
 * @creatTime:2019��10��28��
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
		System.out.println("�ı�flag��ֵ");
		t1.setFalg(false);
		try {
			t1.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�̱߳�־"+t1.getFalg());
	}

}

class TVolatile extends Thread{

	public volatile  Boolean falg=true;//volatile ˢ�¸ñ�����ֵ�����пɼ���
	private int count=0;
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("�߳̿�ʼִ��-----");
		while(falg){
			count++;
			System.out.println(count);
		}
		System.out.println("�߳̽�����,ִ��ѭ������="+this.count);
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
