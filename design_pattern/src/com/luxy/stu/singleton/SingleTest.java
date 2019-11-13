/**
 * 
 */
package com.luxy.stu.singleton;

/**
 * @classDesc: ����ģʽ
 * @author: luxy
 * @createTime: 2019��11��12��
 * @email: luxy@primeton.com
 */
public class SingleTest {
	
	public static void main(String[] args) {
		// ����
		SingletonA s1 = SingletonA.getInstance();
		SingletonA s2 = SingletonA.getInstance();
		System.out.println(s1 == s2);

		// ����
		SingletonB b1 = SingletonB.getInstance();
		SingletonB b2 = SingletonB.getInstance();
		System.out.println(b1 == b2);

		// ˫�ؼ�����
		SingletonC c1 = SingletonC.getInstance();
		SingletonC c2 = SingletonC.getInstance();
		System.out.println(c2 == c1);

	}

}
