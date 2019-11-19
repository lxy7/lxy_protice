/**
 * 
 */
package com.luxy.stu.visitor;

/**
 * @classDesc: 手机通话功能
 * @author: luxy
 * @createTime: 2019年11月18日
 * @email: luxy@primeton.com
 */
public class Call implements Phone {

	/* (non-Javadoc)
	 * @see com.luxy.stu.visitor.Phone#accept(com.luxy.stu.visitor.Visitor)
	 */
	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
        visitor.visit(this);
	}
	
	public String operation(){
		
		return "通话功能！";
		
	}

}
