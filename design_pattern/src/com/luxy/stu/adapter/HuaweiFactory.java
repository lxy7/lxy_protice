/**
 * 
 */
package com.luxy.stu.adapter;

/**
 * @classDesc: huawei����
 * @author: luxy
 * @createTime: 2019��11��14��
 * @email: luxy@primeton.com
 */
public class HuaweiFactory implements AdvancePhoneFactory {

	/* (non-Javadoc)
	 * @see com.luxy.stu.adapter.AdvancePhoneFactory#productOppo(java.lang.String)
	 */
	@Override
	public void productOppo(String factory) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.luxy.stu.adapter.AdvancePhoneFactory#productHuawei(java.lang.String)
	 */
	@Override
	public void productHuawei(String factory) {
		// TODO Auto-generated method stub
        System.out.println("huawei��������--"+factory);
	}

}
