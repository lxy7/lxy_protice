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
 * @classDesc:添加过滤器，防止外部网站进行访问
 * @author: luxy
 * @createTime: 2019年12月5日
 * @email: luxy@primeton.com
 */
public class referFilter implements Filter  {
	
	/* (non-Javadoc)
	 * @see javax.servlet.Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("过滤结束……");
		
	}

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filter)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("执行过滤……");
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		//获取请求资源来源
		String headUrl = req.getHeader("referer");
		
		//获取服务名称
		String serverName = req.getServerName();
		
		System.out.println("referer---"+headUrl+"\n"+"serverName---"+serverName);
		if(headUrl == null || ! headUrl.contains(serverName)){
			//拦截
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
		System.out.println("初始化……");
		
	}

}
