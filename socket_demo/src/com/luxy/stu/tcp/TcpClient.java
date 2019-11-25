/**
 * 
 */
package com.luxy.stu.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @classDesc: 
 * @author: luxy
 * @createTime: 2019��11��25��
 * @email: luxy@primeton.com
 */
public class TcpClient {
	public static void main(String[] args) {
		System.out.println("���������ͻ���������������");
		try {
			//������Ϣ
			Socket socket = new Socket("127.0.0.1", 9003);
			OutputStream output = socket.getOutputStream();
			output.write("I'am Client".getBytes());
			socket.close();
			
			//������Ϣ
			ServerSocket cSocket = new ServerSocket(9005);
			Socket cAccpet = cSocket.accept();
			InputStream input = cAccpet.getInputStream();
			byte [] bytes = new byte[1024];
			int length = input.read(bytes);
			String msg = new String (bytes, 0, length);
			System.out.println("Server:  "+msg);
			cSocket.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
