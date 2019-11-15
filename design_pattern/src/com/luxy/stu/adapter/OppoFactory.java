/**
 * 
 */
package com.luxy.stu.adapter;

/**
 * @classDesc: oppo生产
 * @author: luxy
 * @createTime: 2019年11月14日
 * @email: luxy@primeton.com
 */
public class OppoFactory implements AdvancePhoneFactory {

	/* (non-Javadoc)
	 * @see com.luxy.stu.adapter.AdvancePhoneFactory#productOppo(java.lang.String)
	 */
	@Override
	public void productOppo(String factory) {
		// TODO Auto-generated method stub
		System.out.println("oppo生产厂商--"+factory);
        
	}

	/* (non-Javadoc)
	 * @see com.luxy.stu.adapter.AdvancePhoneFactory#productHuawei(java.lang.String)
	 */
	@Override
	public void productHuawei(String factory) {
		// TODO Auto-generated method stub

	}

}
