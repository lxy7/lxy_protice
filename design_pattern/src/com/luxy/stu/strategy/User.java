/**
 * 
 */
package com.luxy.stu.strategy;

/**
 * @classDesc: 普通用户，商品九五折
 * @author: luxy
 * @createTime: 2019年11月14日
 * @email: luxy@primeton.com
 */
public class User implements Strategy {

	/* (non-Javadoc)
	 * @see com.luxy.stu.strategy.Strategy#getPrice(int)
	 */
	@Override
	public Double getPrice(Double price) {
		// TODO Auto-generated method stub
		return price*0.95;
	}

}
