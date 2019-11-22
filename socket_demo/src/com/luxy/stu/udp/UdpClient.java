/**
 * 
 */
package com.luxy.stu.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

/**
 * @classDesc: 客户端
 * @author: luxy
 * @createTime: 2019年11月21日
 * @email: luxy@primeton.com
 */
public class UdpClient {
	public static void main(String[] args) {
		try {
			DatagramSocket ds = new DatagramSocket(9002);
			while(true){
				System.out.println("myself:");
				Scanner sc = new Scanner(System.in);
				String msg = sc.nextLine();
				byte [] bytes = msg.getBytes();
				DatagramPacket dp = new DatagramPacket(bytes, bytes.length, 
						InetAddress.getLocalHost(), 9001);
				ds.send(dp);
				
				//接收服务器的信息
	            byte[] recBuf = new byte[1024];
	            DatagramPacket recDp = new DatagramPacket(recBuf,recBuf.length);
	            //信息接收
	            ds.receive(recDp);
	            
	            String recMsg = new String(recBuf,0,recDp.getLength());
	            System.out.println("Server:"+recMsg);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
