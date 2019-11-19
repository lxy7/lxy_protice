/**
 * 
 */
package com.luxy.stu.visitor;

/**
 * @classDesc: ������Ա
 * @author: luxy
 * @createTime: 2019��11��18��
 * @email: luxy@primeton.com
 */
public class Business implements Visitor {

	/* (non-Javadoc)
	 * @see com.luxy.stu.visitor.Visitor#visit(com.luxy.stu.visitor.Call)
	 */
	@Override
	public void visit(Call call) {
		// TODO Auto-generated method stub
		System.out.println("������Ա�ȽϹ�ע�ֻ��ġ���������"+call.operation());

	}

	/* (non-Javadoc)
	 * @see com.luxy.stu.visitor.Visitor#visit(com.luxy.stu.visitor.Photography)
	 */
	@Override
	public void visit(Photography photography) {
		// TODO Auto-generated method stub
         System.out.println("������Ա����ע�ֻ��ġ���������"+photography.operation());
	}

}
