/**
 * 
 */
package com.luxy.stu.adapter;

/**
 * @classDesc: 
 * @author: luxy
 * @createTime: 2019Äê11ÔÂ14ÈÕ
 * @email: luxy@primeton.com
 */
public class PhoneAdapter implements PhoneFactory {
	
	private AdvancePhoneFactory advancePhoneFactory;
	

	public PhoneAdapter(String type) {
		// TODO Auto-generated constructor stub
		if(type.equals("oppo")){
			advancePhoneFactory = new OppoFactory();
		}else if(type.equals("huawei")){
			advancePhoneFactory = new HuaweiFactory();
		}
	}

	/* (non-Javadoc)
	 * @see com.luxy.stu.adapter.PhoneFactory#product(java.lang.String, java.lang.String)
	 */
	@Override
	public void product(String type, String factory) {
		// TODO Auto-generated method stub
		if(type.equals("oppo")){
			advancePhoneFactory.productOppo(factory);
		}else if(type.equals("huawei")){
			advancePhoneFactory.productHuawei(factory);
		}

	}

}
