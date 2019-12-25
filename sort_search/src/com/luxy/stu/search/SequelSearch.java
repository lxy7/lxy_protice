/**
 * 
 */
package com.luxy.stu.search;

import java.util.Scanner;

/**
 * @classDesc: 顺序查找
 * @author: luxy
 * @createTime: 2019年12月25日
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
		System.out.println("请输入需要查找的数:");
		int data = sc.nextInt();
		int result = search(arr, data);
		if(result == -1){//没查询到数据
			System.out.println("查询失败！");
		}else{
			System.out.println("数据位置为: "+ result);
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
