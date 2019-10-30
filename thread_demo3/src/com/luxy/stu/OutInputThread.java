/**
 * 
 */
package com.luxy.stu;

/**
 * @classDesc:���߳�֮��ͨѶ
 * @author: luxy
 * @creatTime:2019��10��30��
 * @email:luxy@primeton.com
 */
public class OutInputThread {
	
	public static void main(String[] args) {
		Share share=new Share();
		OutThread out =new OutThread(share);
		InputThread input=new InputThread(share);
		out.start();
		input.start();
	}
	
}
/*
 * ������Դ��
 */
class Share{
	
	private String name;
	private String code;
	private Boolean flag=false;
	
	
	/**
	 * @return the flag
	 */
	public Boolean getFlag() {
		return flag;
	}
	/**
	 * @param flag the flag to set
	 */
	public void setFlag(Boolean flag) {
		this.flag = flag;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	
}
/*
 * �����̣߳�ִ��д����
 */
class OutThread extends Thread{
	private int flag=1;
	private Share share;
	
	/**
	 * @param share
	 */
	public OutThread(Share share) {
		this.share = share;
	}	

	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			synchronized (share) {//ͬ�����̰߳�ȫ
				if(share.getFlag()){//false ִ��д������true�ͷ���
					try {
						share.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(flag % 2 == 0){
					share.setCode("������");
					share.setName("ż��");
				}else{
					share.setCode("��������");
					share.setName("����");
				}
				System.out.println(flag);
				flag++;
				share.setFlag(true);
				share.notify();
			}
		}
		
	}

}



/*
 * ����̣߳�ִ�ж�����
 */
class InputThread extends Thread{
	private Share share;

	
	/**
	 * @param share
	 */
	public InputThread(Share share) {
		super();
		this.share = share;
	}


	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			synchronized (share) {//ͬ�����̰߳�ȫ
				try {
					if(!share.getFlag()){//true ִ�ж����� �����ͷ���
						share.wait();
					}
					System.out.println(share.getName()+"-------"+share.getCode());					
						this.sleep(10);	
						share.setFlag(false);
						share.notify();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
	
}