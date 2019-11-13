/**
 * 
 */
package com.luxy.stu.singleton;

/**
 * @classDesc: 单例模式
 * @author: luxy
 * @createTime: 2019年11月12日
 * @email: luxy@primeton.com
 */
public class SingleTest {
	
	public static void main(String[] args) {
		// 懒汉
		SingletonA s1 = SingletonA.getInstance();
		SingletonA s2 = SingletonA.getInstance();
		System.out.println(s1 == s2);

		// 饿汉
		SingletonB b1 = SingletonB.getInstance();
		SingletonB b2 = SingletonB.getInstance();
		System.out.println(b1 == b2);

		// 双重检验锁
		SingletonC c1 = SingletonC.getInstance();
		SingletonC c2 = SingletonC.getInstance();
		System.out.println(c2 == c1);

	}

}
