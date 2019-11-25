/**
 * 
 */
package com.luxy.stu.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @classDesc: 
 * @author: luxy
 * @createTime: 2019年11月25日
 * @email: luxy@primeton.com
 */
public class TcpServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("————服务端启动————");
		try {
			//接收消息
			ServerSocket socket = new ServerSocket(9003);
			//接收请求
			Socket accept = socket.accept();
			//获取字节流
			InputStream input = accept.getInputStream();
			byte[] bytes = new byte[1024];
			int len = input.read(bytes);
			String msg = new String (bytes, 0, len);
			System.out.println("Client:  "+msg);
			socket.close();
			
			//发送消息
			Socket socket1 = new Socket("127.0.0.1", 9005);
			OutputStream output = socket1.getOutputStream();
			output.write("I'am Server".getBytes());
			socket1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
