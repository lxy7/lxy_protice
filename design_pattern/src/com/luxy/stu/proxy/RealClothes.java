/**
 * 
 */
package com.luxy.stu.proxy;

/**
 * @classDesc: 
 * @author: luxy
 * @createTime: 2019年11月14日
 * @email: luxy@primeton.com
 */
public class RealClothes implements Clothes {
	
	
	public RealClothes() {
		// TODO Auto-generated constructor stub
		this.design();
		this.make();
	}

	/* (non-Javadoc)
	 * @see com.luxy.stu.proxy.Clothes#sale()
	 */
	@Override
	public void sale() {
		// TODO Auto-generated method stub
		System.out.println("衣服开始出售......");
	}
	
	public void design(){
		System.out.println("衣服正在设计.....");
		
	}
	
	public void make(){
		System.out.println("衣服正在制作.....");
		
	}

}
