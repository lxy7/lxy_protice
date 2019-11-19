/**
 * 
 */
package com.luxy.stu.visitor;

/**
 * @classDesc: 商务人员
 * @author: luxy
 * @createTime: 2019年11月18日
 * @email: luxy@primeton.com
 */
public class Business implements Visitor {

	/* (non-Javadoc)
	 * @see com.luxy.stu.visitor.Visitor#visit(com.luxy.stu.visitor.Call)
	 */
	@Override
	public void visit(Call call) {
		// TODO Auto-generated method stub
		System.out.println("商务人员比较关注手机的—————"+call.operation());

	}

	/* (non-Javadoc)
	 * @see com.luxy.stu.visitor.Visitor#visit(com.luxy.stu.visitor.Photography)
	 */
	@Override
	public void visit(Photography photography) {
		// TODO Auto-generated method stub
         System.out.println("商务人员不关注手机的—————"+photography.operation());
	}

}
