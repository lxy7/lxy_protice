/**
 * 
 */
package com.luxy.stu.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

/**
 * @classDesc: 服务器类
 * @author: luxy
 * @createTime: 2019年11月21日
 * @email: luxy@primeton.com
 */
public class UdpServer {
	
	public static void main(String[] args) {
		System.out.println("—————服务器已启动—————");
		
		try {
			//创建服务器端口
			DatagramSocket ds = new DatagramSocket(9001);
			while(true){
				byte [] bytes = new byte [1024];
				//接收消息
				DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
				ds.receive(dp);
		        String msg = new String(bytes, 0, dp.getLength());
		        System.out.println("Client: "+msg);
		        
		        //发送消息到客户端
		        System.out.println("myself: ");
		        Scanner in = new Scanner(System.in);
		        String sMsg = in.nextLine();
		        //System.out.println("Server: "+sMsg);
		        byte [] sbytes = sMsg.getBytes();
		        DatagramPacket sdp = new DatagramPacket(sbytes, sbytes.length, 
		        		InetAddress.getLocalHost(), 9002);
		        ds.send(sdp);
		            
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
