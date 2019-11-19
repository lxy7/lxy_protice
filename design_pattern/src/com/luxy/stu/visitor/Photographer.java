/**
 * 
 */
package com.luxy.stu.visitor;

/**
 * @classDesc: 
 * @author: luxy
 * @createTime: 2019��11��18��
 * @email: luxy@primeton.com
 */
public class Photographer implements Visitor {

	/* (non-Javadoc)
	 * @see com.luxy.stu.visitor.Visitor#visit(com.luxy.stu.visitor.Call)
	 */
	@Override
	public void visit(Call call) {
		// TODO Auto-generated method stub
		System.out.println("��Ӱʦ����ע�ֻ��ġ�����������"+call.operation());

	}

	/* (non-Javadoc)
	 * @see com.luxy.stu.visitor.Visitor#visit(com.luxy.stu.visitor.Photography)
	 */
	@Override
	public void visit(Photography photography) {
		// TODO Auto-generated method stub
		System.out.println("��Ӱʦ�ȽϹ�ע�ֻ��ġ�����������"+photography.operation());

	}

}
