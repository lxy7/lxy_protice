/**
 * 
 */
package com.luxy.stu.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @classDesc: 手机功能汇总
 * @author: luxy
 * @createTime: 2019年11月18日
 * @email: luxy@primeton.com
 */
public class PhoneStruture {
	
	private List<Phone> phoneList = new ArrayList<Phone>();
	
	public void addFuncation (Phone phone){
		
		phoneList.add(phone);
	}
	
	public void visitor(Visitor visitor){
		for(Phone phone : phoneList ){
			phone.accept(visitor);
		}
		
	}
	

}
