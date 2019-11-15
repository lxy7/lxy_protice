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
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProxyClothes proxyClothes = new ProxyClothes();
		
		//加载真实类
		proxyClothes.sale();
		
		System.out.println("_______________________\n");
		//无需加载
		proxyClothes.sale();
		

	}

}
