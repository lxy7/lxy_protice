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
        String sql = "select id,name,password from a_user where id = ?";
        try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lxy", "root", "root123");
			PreparedStatement state = con.prepareStatement(sql);
			state.setString(1, "2018001");
			ResultSet result =  state.executeQuery();
			while ( result.next()){
				String id = result.getString(1);
				String name = result.getString(2);
				String password = result.getString(3);
				System.out.println(id + "  "+name + "  "+password);
			}
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
