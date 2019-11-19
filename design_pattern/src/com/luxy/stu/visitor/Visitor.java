/**
 * 
 */
package com.luxy.stu.visitor;

/**
 * @classDesc: ������
 * @author: luxy
 * @createTime: 2019��11��18��
 * @email: luxy@primeton.com
 */
public interface Visitor {
	
	public void visit(Call call);
	
	public void visit(Photography photography);

}
