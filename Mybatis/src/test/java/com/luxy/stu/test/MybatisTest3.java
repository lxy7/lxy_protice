/**
 * 
 */
package com.luxy.stu.test;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.luxy.stu.entity.User;

/**
 * @classDesc: sql注入-非法登录
 * @author: luxy
 * @createTime: 2020年1月7日
 * @email: luxy@primeton.com
 */
public class MybatisTest3 {
	public static void main(String[] args) {
		String path = "mybatis.xml";
		try {
			//读取配置文件
			Reader reader = Resources.getResourceAsReader(path);
			//创建会话工厂
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			//获取方法名
			String methodName = "com.luxy.stu.mapper.UserMapper.login";
			HashMap<String , String> param = new HashMap();
			param.put("name", "luxy");
			param.put("password", "123123");
			/*User user = new User();
			user.setName("admin");
			user.setPassword("123456");*/
			//User user = sqlSession.selectOne(methodName, param);
			List<User> list = sqlSession.selectList(methodName, param);
			if (list.isEmpty()){
				System.out.println("用户查询失败!");
				return;
			}	
			 User user = list.get(0);
			System.out.println(user.getName()+"   " + user.getPassword());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
