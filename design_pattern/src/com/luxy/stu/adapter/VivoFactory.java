/**
 * 
 */
package com.luxy.stu.adapter;

/**
 * @classDesc: 
 * @author: luxy
 * @createTime: 2019年11月14日
 * @email: luxy@primeton.com
 */
public class VivoFactory implements PhoneFactory {
	
	private PhoneAdapter phoneAdapter;

	/* (non-Javadoc)
	 * @see com.luxy.stu.adapter.PhoneFactory#product(java.lang.String, java.lang.String)
	 */
	@Override
	public void product(String type, String factory) {
		// TODO Auto-generated method stub
		if(type.equals("vivo")){
			System.out.println("vivo生产厂商--"+factory);
		}else if(type.equals("oppo")||type.equals("huawei")){
			phoneAdapter = new PhoneAdapter(type);
			phoneAdapter.product(type, factory);
		}else{
			System.out.println("找不到对应的生产厂商!!!");
		}

	}

}
