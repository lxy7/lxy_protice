/**
 * 
 */
package com.luxy.stu.proxy;

/**
 * @classDesc: ������,ֻ�������
 * @author: luxy
 * @createTime: 2019��11��14��
 * @email: luxy@primeton.com
 */
public class ProxyClothes implements Clothes {
	
	private RealClothes realClothes;

	/* (non-Javadoc)
	 * @see com.luxy.stu.proxy.Clothes#sale()
	 */
	@Override
	public void sale() {
		// TODO Auto-generated method stub
		if(realClothes == null){
			realClothes = new RealClothes();
		}
		realClothes.sale();

	}

}
