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
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProxyClothes proxyClothes = new ProxyClothes();
		
		//������ʵ��
		proxyClothes.sale();
		
		System.out.println("_______________________\n");
		//�������
		proxyClothes.sale();
		

	}

}
