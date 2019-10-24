/**
 * 
 */
package com.luxy.stu;

import java.util.ArrayList;
import java.util.List;

import com.luxy.stu.entity.Student;

/**
 * @classDesc:ʹ�ö��̷߳�����������
 * @author: luxy
 * @creatTime:2019��10��23��
 * @email:luxy@primeton.com
 */
public class BatchSms {
	public static void main(String[] args) {
		// 1.��ʼ������
		List<Student> student = init();
		// 2.����ÿ���̷߳�������������
		int pageSize = 20;
		// 3.����ÿ������Ҫ�����ܵ�����
		List<List<Student>> splitList = splitList(student, pageSize);
		for (int i = 0; i < splitList.size(); i++) {
			List<Student> list = splitList.get(i);
			SendThread sendThread = new SendThread(list);
			//4.���䷢��
			Thread thread = new Thread(sendThread,"�߳�"+i);
			thread.start();
		}
		
	}
	/*
	 * ��ʼ������
	 */
	public static List<Student> init() {
		List<Student> list = new ArrayList<Student>();
		for (int i = 0; i < 100; i++) {
			list.add(new Student("stuId:" + i, "stuName:" + i));
		}
		return list;
	}
	/*
	 * ������������
	 */
	public static <T> List splitList(List<T> list,int pageSize) {
		List<List<T>> listArray = new ArrayList<List<T>>();
		//����Ӧ��Ϊ����
		int page=(list.size() + (pageSize - 1))/pageSize;
		for (int i = 0; i < page; i++) {//ȡ��ÿ����Ӧ������
			List<T> data=new ArrayList<>();
			for (int j = i * pageSize; j < (i + 1) * pageSize; j++) {//��������
				data.add(list.get(j));
			}
			listArray.add(data);
		}
		return listArray;
	}
}

/*
 * �����߳�
 */
class SendThread implements Runnable {
	private List<Student> stu;
	public SendThread(List<Student> stu) {
		this.stu=stu;
	}

	@Override
	public void run() {
		for (Student st : stu) {
			System.out.println(Thread.currentThread().getName()+","+st.toString());
		}
		System.out.println();
	}
}
