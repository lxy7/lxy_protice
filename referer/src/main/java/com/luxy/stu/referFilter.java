/**
 * 
 */
package com.luxy.stu;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.ast.ReferenceExpression;

/**
 * @classDesc:��ӹ���������ֹ�ⲿ��վ���з���
 * @author: luxy
 * @createTime: 2019��12��5��
 * @email: luxy@primeton.com
 */
public class referFilter implements Filter  {
	
	/* (non-Javadoc)
	 * @see javax.servlet.Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("���˽�������");
		
	}

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filter)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("ִ�й��ˡ���");
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		//��ȡ������Դ��Դ
		String headUrl = req.getHeader("referer");
		
		//��ȡ��������
		String serverName = req.getServerName();
		
		System.out.println("referer---"+headUrl+"\n"+"serverName---"+serverName);
		if(headUrl == null || ! headUrl.contains(serverName)){
			//����
			req.getRequestDispatcher("error.png").forward(req, res);
			return ;
		}
		
		filter.doFilter(req, res);
	}

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
	 */
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("��ʼ������");
		
	}

}
