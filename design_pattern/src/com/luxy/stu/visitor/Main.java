/**
 * 
 */
package com.luxy.stu.visitor;

/**
 * @classDesc: 
 * @author: luxy
 * @createTime: 2019��11��19��
 * @email: luxy@primeton.com
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PhoneStruture phoneStruture = new PhoneStruture();
		
		phoneStruture.addFuncation(new Call());
		phoneStruture.addFuncation(new Photography());
		
		phoneStruture.visitor(new Business());
		phoneStruture.visitor(new Photographer());

	}

}
