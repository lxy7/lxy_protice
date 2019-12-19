/**
 * 
 */
package com.luxy.stu.sort;

import java.awt.print.Printable;

/**
 * @classDesc: 希尔排序
 * @author: luxy
 * @createTime: 2019年12月19日
 * @email: luxy@primeton.com
 */
public class ShellSort {
	
	public static InsertSort insertSort;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {10,8,12,3,25,7,13,2,20,17};
		sort(arr);
	}
	
	public static void sort(int arr[]){
		double d1 = arr.length;
		while(true){
			d1 = Math.ceil(d1/2);
			int d = (int) d1;
			int temp=0;
			System.out.println(d1);
			for (int x = 0; x < d; x++) {//分组执行插入排序
				for (int i = x + d; i < arr.length; i += d) {
					temp = arr[i];
					int j = i;
					
					while (j-d >= 0 && temp < arr[j - d]){
						arr[j] = arr[j - d];
						j -= d;
						//System.out.println("j= "+ (j-d)+(j > 0));
					}
					arr[j] = temp;
				}				
			}
			insertSort.print(arr);	
			if(d1 == 1.0){
				break;
			}
		}
		
	}

}
