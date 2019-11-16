/**
 * 
 */
package com.luxy.stu.strategy;

/**
 * @classDesc: 普通会员，商品9折
 * @author: luxy
 * @createTime: 2019年11月14日
 * @email: luxy@primeton.com
 */
public class Member implements Strategy {

	/* (non-Javadoc)
	 * @see com.luxy.stu.strategy.Strategy#getPrice(java.lang.Double)
	 */
	@Override
	public Double getPrice(Double price) {
		// TODO Auto-generated method stub
		return price*0.9;
	}

}
