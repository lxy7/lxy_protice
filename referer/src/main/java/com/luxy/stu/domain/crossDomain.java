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
 * @classDesc: �������
 * @author: luxy
 * @createTime: 2019��12��11��
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
		System.out.println("ִ��doget()����");
		this.doPost(req, resp);
	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("ִ��post����");
		String name = req.getParameter("name");
		System.out.println(name);
		resp.setContentType("application/json");
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name", name);
		resp.getWriter().println(jsonObject.toJSONString() );
		//����������-1.����ͷ����������
		resp.setHeader("Access-Control-Allow-Origin", "*");
		
		
	}
	

}
