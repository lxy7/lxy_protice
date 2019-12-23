/**
 * 
 */
package com.luxy.stu.sort;

/**
 * @classDesc: 冒泡排序
 * @author: luxy
 * @createTime: 2019年12月23日
 * @email: luxy@primeton.com
 */
public class BubbleSort {
	InsertSort insertSort;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {32,45,7,5,50,12,20};
		sort(arr);

	}
	
	public static void sort(int arr[]){
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println("第"+i+"次排序结果");
			InsertSort.print(arr);
		}
		
	}

}
