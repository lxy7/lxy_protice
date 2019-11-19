/**
 * 
 */
package com.luxy.stu.visitor;

/**
 * @classDesc: ���չ���
 * @author: luxy
 * @createTime: 2019��11��18��
 * @email: luxy@primeton.com
 */
public class Photography implements Phone {

	/* (non-Javadoc)
	 * @see com.luxy.stu.visitor.Phone#accept(com.luxy.stu.visitor.Visitor)
	 */
	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
        visitor.visit(this);
	}
	
	public String operation(){
		
		return "���չ���";
	}

}
