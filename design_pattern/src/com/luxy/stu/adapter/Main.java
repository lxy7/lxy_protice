/**
 * 
 */
package com.luxy.stu.adapter;

/**
 * @classDesc: 适配器模式入口
 * @author: luxy
 * @createTime: 2019年11月14日
 * @email: luxy@primeton.com
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VivoFactory vivoFactory = new VivoFactory();
		vivoFactory.product("vivo", "vivo公司");
		vivoFactory.product("oppo", "oppo公司");
		vivoFactory.product("huawei", "华为公司");
		vivoFactory.product("apple", "苹果公司");
	}

}
