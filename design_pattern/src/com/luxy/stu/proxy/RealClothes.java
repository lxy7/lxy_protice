/**
 * 
 */
package com.luxy.stu.proxy;

/**
 * @classDesc: 
 * @author: luxy
 * @createTime: 2019��11��14��
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
		System.out.println("�·���ʼ����......");
	}
	
	public void design(){
		System.out.println("�·��������.....");
		
	}
	
	public void make(){
		System.out.println("�·���������.....");
		
	}

}
