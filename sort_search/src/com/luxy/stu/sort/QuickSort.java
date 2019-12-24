/**
 * 
 */
package com.luxy.stu.sort;

/**
 * @classDesc: ��������
 * @author: luxy
 * @createTime: 2019��12��24��
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
		System.out.println("����    "+ arr[low]);
		int temp = arr[low];//�Ե�һ����Ϊ��׼
		int i = low,j = high;
		int swap;
		while (i < j){
			while (arr[j] >= temp && i < j){//���������ұȻ�׼С����
				j--;
			}
			while (arr[i] <= temp && i < j){//���������ұȻ�׼�����
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
		System.out.println("��"+count+"��������");
		InsertSort.print(arr);
		sort(arr, low, j - 1);//��׼���
		sort(arr, i + 1, high);
		
	}

}
