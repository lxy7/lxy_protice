/**
 * 
 */
package com.luxy.stu.search;

import java.util.Scanner;

import com.luxy.stu.sort.QuickSort;

/**
 * @classDesc: ���ֲ���
 * @author: luxy
 * @createTime: 2019��12��25��
 * @email: luxy@primeton.com
 */
public class BinarySearch {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {3,55,10,22,66,31,77,17,35};
		//��������
		QuickSort quickSort = new QuickSort();
		quickSort.sort(arr, 0, arr.length - 1);
		System.out.println("Ҫ���ҵ���:");
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		int result = search(arr, data);
		if(result == -1){//û��ѯ������
			System.out.println("��ѯʧ�ܣ�");
		}else{
			System.out.println("����λ��Ϊ: "+ result);
		}
		

	}
	public static int search(int arr[],int data){
		int low = 0,high = arr.length-1;
		int mid;
		while (low <= high){
			mid = (low + high)/2;
			System.out.println("mid = "+mid);
			if (arr[mid] < data){//���Ұ벿��
				low = mid + 1;
			}else if(arr[mid] > data){//����벿��
				high = mid -1;
			}else if (arr[mid] == data) {
				return mid;
			}
		}
		
		return -1;
	}

}
