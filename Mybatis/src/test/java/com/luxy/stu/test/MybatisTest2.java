/**
 * 
 */
package com.luxy.stu.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;





/**
 * @classDesc: sql注入
 * @author: luxy
 * @createTime: 2020年1月2日
 * @email: luxy@primeton.com
 */
public class MybatisTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "'' or 1=1 -- ";
		String password = "123123";
        //String sql = "select id,name,password from a_user where name = "+name+"and password ="+password;//后台动态拼接风险
         String sql = "select id,name,password from a_user where id = ?";
		 System.out.println(sql);
        try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lxy", "root", "root123");
			PreparedStatement state = con.prepareStatement(sql);
			//设置参数值
			state.setString(1, "2018001");
			ResultSet result =  state.executeQuery();
			while ( result.next()){
				String id = result.getString(1);
				String name1 = result.getString(2);
				String password1 = result.getString(3);
				System.out.println(id + "  "+name1 + "  "+password1);
			}
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
