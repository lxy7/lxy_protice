/**
 * 
 */
package com.luxy.stu.sort;

/**
 * @classDesc: 快速排序
 * @author: luxy
 * @createTime: 2019年12月24日
 * @email: luxy@primeton.com
 */
public class QuickSort {
	
	InsertSort insertSort;
	static int count = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {7,4,22,36,3,10,6,15};
		sort(arr, 0, arr.length -1);

	}
	public static void sort(int arr[],int low, int high){
		if(low > high){
			return;
		}
		System.out.println("基数    "+ arr[low]);
		int temp = arr[low];//以第一个数为基准
		int i = low,j = high;
		int swap;
		while (i < j){
			while (arr[j] >= temp && i < j){//自右往左找比基准小的数
				j--;
			}
			while (arr[i] <= temp && i < j){//自左往右找比基准大的数
				i++;
			}
			if(i < j){
				swap = arr[j];
				arr[j] = arr[i];
				arr[i] = swap;
			}
		}
		arr[low] = arr[i];
		arr[i] = temp;
		count ++;
		System.out.println("第"+count+"次排序结果");
		InsertSort.print(arr);
		sort(arr, low, j - 1);//基准左边
		sort(arr, i + 1, high);
		
	}

}
