/**
 * 
 */
package com.luxy.stu.strategy;

/**
 * @classDesc: ��ͨ��Ա����Ʒ9��
 * @author: luxy
 * @createTime: 2019��11��14��
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