/**
 * 
 */
package com.luxy.stu.sort;

/**
 * @classDesc: 直接插入排序
 * @author: luxy
 * @createTime: 2019年12月19日
 * @email: luxy@primeton.com
 */
public class InsertSort {
	
	public static void main(String[] args) {
		int arr[] = {5,7,1,4,6};
		int arr1[] = {49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
		sort(arr1);
		
	}
	public static void sort(int arr[]){
		int temp = 0;
	    for(int i = 1; i < arr.length; i++){
	    	temp = arr[i];
	    	int j = i;
	    	while (j > 0 && temp < arr[j-1]){
	    		arr[j] = arr[j-1];
	    		j--;
	    	}
	    	arr[j] = temp;
	    	System.out.println("第"+i+"次排序结果");
	    	print(arr);	    	
	    }	    
	}
	
	public static void print(int arr[]){
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+"  ");
		}
	}

}
