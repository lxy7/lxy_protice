/**
 * 
 */
package com.luxy.stu.domain;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;



/**
 * @classDesc: 跨域访问
 * @author: luxy
 * @createTime: 2019年12月11日
 * @email: luxy@primeton.com
 */
@WebServlet("/domain")
public class crossDomain extends HttpServlet {

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("执行doget()……");
		this.doPost(req, resp);
	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("执行post请求");
		String name = req.getParameter("name");
		System.out.println(name);
		resp.setContentType("application/json");
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name", name);
		resp.getWriter().println(jsonObject.toJSONString() );
		//跨域解决方法-1.设置头部允许所有
		resp.setHeader("Access-Control-Allow-Origin", "*");
		
		
	}
	

}
