/**
 * 
 */
package com.luxy.stu;

/**
 * @classDesc:多线程之间通讯
 * @author: luxy
 * @creatTime:2019年10月30日
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
 * 共享资源类
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
 * 输入线程，执行写操作
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
			synchronized (share) {//同步，线程安全
				if(share.getFlag()){//false 执行写操作，true释放锁
					try {
						share.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(flag % 2 == 0){
					share.setCode("能整除");
					share.setName("偶数");
				}else{
					share.setCode("不能整除");
					share.setName("奇数");
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
 * 输出线程，执行读操作
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
			synchronized (share) {//同步，线程安全
				try {
					if(!share.getFlag()){//true 执行读操作 否则释放锁
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