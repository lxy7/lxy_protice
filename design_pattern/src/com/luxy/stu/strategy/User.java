/**
 * 
 */
package com.luxy.stu.strategy;

/**
 * @classDesc: ��ͨ�û�����Ʒ������
 * @author: luxy
 * @createTime: 2019��11��14��
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
