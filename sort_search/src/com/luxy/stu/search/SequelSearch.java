/**
 * 
 */
package com.luxy.stu.search;

import java.util.Scanner;

/**
 * @classDesc: ˳�����
 * @author: luxy
 * @createTime: 2019��12��25��
 * @email: luxy@primeton.com
 */
public class SequelSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {34,3,5,14,23,44,17,6,78,29,66,87};
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ���ҵ���:");
		int data = sc.nextInt();
		int result = search(arr, data);
		if(result == -1){//û��ѯ������
			System.out.println("��ѯʧ�ܣ�");
		}else{
			System.out.println("����λ��Ϊ: "+ result);
		}

	}
	public static int search(int arr[],int data){
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == data){
				return i;
			}
		}
		return -1;
	}

}
