/**
 * 
 */
package com.luxy.stu.visitor;

/**
 * @classDesc: 访问者
 * @author: luxy
 * @createTime: 2019年11月18日
 * @email: luxy@primeton.com
 */
public interface Visitor {
	
	public void visit(Call call);
	
	public void visit(Photography photography);

}
