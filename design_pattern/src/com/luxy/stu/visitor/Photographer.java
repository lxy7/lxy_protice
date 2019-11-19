/**
 * 
 */
package com.luxy.stu.visitor;

/**
 * @classDesc: 
 * @author: luxy
 * @createTime: 2019年11月18日
 * @email: luxy@primeton.com
 */
public class Photographer implements Visitor {

	/* (non-Javadoc)
	 * @see com.luxy.stu.visitor.Visitor#visit(com.luxy.stu.visitor.Call)
	 */
	@Override
	public void visit(Call call) {
		// TODO Auto-generated method stub
		System.out.println("摄影师不关注手机的——————"+call.operation());

	}

	/* (non-Javadoc)
	 * @see com.luxy.stu.visitor.Visitor#visit(com.luxy.stu.visitor.Photography)
	 */
	@Override
	public void visit(Photography photography) {
		// TODO Auto-generated method stub
		System.out.println("摄影师比较关注手机的——————"+photography.operation());

	}

}
