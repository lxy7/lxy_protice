/**
 * 
 */
package com.luxy.stu.search;

import java.util.Scanner;

import com.luxy.stu.sort.QuickSort;

/**
 * @classDesc: 二分查找
 * @author: luxy
 * @createTime: 2019年12月25日
 * @email: luxy@primeton.com
 */
public class BinarySearch {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {3,55,10,22,66,31,77,17,35};
		//进行排序
		QuickSort quickSort = new QuickSort();
		quickSort.sort(arr, 0, arr.length - 1);
		System.out.println("要查找的数:");
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		int result = search(arr, data);
		if(result == -1){//没查询到数据
			System.out.println("查询失败！");
		}else{
			System.out.println("数据位置为: "+ result);
		}
		

	}
	public static int search(int arr[],int data){
		int low = 0,high = arr.length-1;
		int mid;
		while (low <= high){
			mid = (low + high)/2;
			System.out.println("mid = "+mid);
			if (arr[mid] < data){//找右半部分
				low = mid + 1;
			}else if(arr[mid] > data){//找左半部分
				high = mid -1;
			}else if (arr[mid] == data) {
				return mid;
			}
		}
		
		return -1;
	}

}
