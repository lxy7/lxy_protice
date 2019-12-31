/**
 * 
 */
package com.luxy.stu.test;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.luxy.stu.entity.User;

/**
 * @classDesc: 
 * @author: luxy
 * @createTime: 2019年12月31日
 * @email: luxy@primeton.com
 */
public class MybatisTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "mybatis.xml";
		try {
			//读取配置文件
			Reader reader = Resources.getResourceAsReader(path);
			//创建会话工厂
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			//获取方法名
			String methodName = "com.luxy.stu.mapper.UserMapper.getUser";
			User user = sqlSession.selectOne(methodName, "2018001");
			if (user == null){
				System.out.println("用户查询失败!");
				return;
			}
			System.out.println(user.getName()+"   " + user.getPassword());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
