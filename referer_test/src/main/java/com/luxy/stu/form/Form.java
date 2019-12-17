/**
 * 
 */
package com.luxy.stu.form;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @classDesc: ������ظ��ύ����
 * @author: luxy
 * @createTime: 2019��12��13��
 * @email: luxy@primeton.com
 * 
 */
@WebServlet("/form")
public class Form extends HttpServlet {

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("get");
		this.doPost(req, resp);
	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("post");
		if(! isFlag(req)){
			resp.getWriter().write("faile");
			System.out.println("�ظ��ύ");
			return;
		}
		String name = req.getParameter("userName");
		System.out.println("��ȡname="+name);
		resp.getWriter().write("success");
	}
	
	public boolean isFlag(HttpServletRequest req){
		String formToken = req.getParameter("token");//��ȡ���е�tokenֵ
		String sessionToken = (String) req.getSession().getAttribute("token");//��ȡsession�е�token
		if(formToken == null || formToken.isEmpty()){
			System.out.println("��tokenֵΪ�գ�����");
			return false;
		}else if(sessionToken == null || sessionToken.isEmpty()){
			System.out.println("�ỰtokenֵΪ�գ�����");
			return false;
		}else if(! sessionToken.equals(formToken)){
			System.out.println("sessionToken = " + sessionToken +"formToken = " +formToken);
			return false;
		}
		System.out.println("ɾ��sessionToken");
		req.getSession().removeAttribute("token");
		return true;
	}

}
