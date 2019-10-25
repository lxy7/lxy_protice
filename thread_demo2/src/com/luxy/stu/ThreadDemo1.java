/**
 * 
 */
package com.luxy.stu;

/**
 * @classDesc:���߳�ģ����Ʊ����
 * @author: luxy
 * @creatTime:2019��10��24��
 * @email:luxy@primeton.com
 */
public class ThreadDemo1 {
	public static void main(String[] args) {
		Thread1 thread=new Thread1();
		Thread t1=new Thread (thread,"���ڢ�");
		Thread t2 = new Thread(thread,"���ڢ�");//newһ�Σ�������Դ
		t1.start();
		t2.start();
	}

}

class Thread1 implements Runnable {
	private int count=100;//��ʼ��Ʊ��
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
			//ͬ������鷽��
			//sale();
			//ͬ����������
			sale2();
		}
		
	}
	
	//ͬ����������̰߳�ȫ����
	public void sale(){
		synchronized (Object) {
			if(count>0){
				int num=100-count+1;//��ǰ���۵�Ʊ���
				System.out.println("Thread-----"+Thread.currentThread().getName()+"���۵�"+num+"��Ʊ");
				count--;	
			}else{
				System.out.println("Thread-----"+Thread.currentThread().getName()+"Ʊ���ۿգ�");
			}	
		}
		
	}
	//ͬ������
	public synchronized void sale2() {
		if(count>0){
			int num=100-count+1;//��ǰ���۵�Ʊ���
			System.out.println("Thread-----"+Thread.currentThread().getName()+"���۵�"+num+"��Ʊ");
			count--;	
		}else{
			System.out.println("Thread-----"+Thread.currentThread().getName()+"Ʊ���ۿգ�");
		}	
		
	}
	
}
