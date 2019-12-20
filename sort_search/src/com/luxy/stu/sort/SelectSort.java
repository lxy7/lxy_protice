/**
 * 
 */
package com.luxy.stu.sort;

/**
 * @classDesc: 简单选择排序
 * @author: luxy
 * @createTime: 2019年12月20日
 * @email: luxy@primeton.com
 */
public class SelectSort {
	public static InsertSort insertSort;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {52,68,59,57,1};
		sort(arr);
    
	}
	public static void sort(int arr[]){
		int temp = 0;
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			temp = arr[i];
			index = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j] < temp){
					temp = arr[j];
					index = j;
				}	
				arr[index] = arr[i];
				arr[i] = temp;				
			}
			System.out.println("第"+i+"次排序结果");
			insertSort.print(arr);
		}
	}

}
