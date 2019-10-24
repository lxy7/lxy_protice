/**
 * 
 */
package com.luxy.stu;

import java.util.ArrayList;
import java.util.List;

import com.luxy.stu.entity.Student;

/**
 * @classDesc:使用多线程分批处理数据
 * @author: luxy
 * @creatTime:2019年10月23日
 * @email:luxy@primeton.com
 */
public class BatchSms {
	public static void main(String[] args) {
		// 1.初始化数据
		List<Student> student = init();
		// 2.定义每个线程分批处理数据量
		int pageSize = 20;
		// 3.计算每个线需要分配跑的数据
		List<List<Student>> splitList = splitList(student, pageSize);
		for (int i = 0; i < splitList.size(); i++) {
			List<Student> list = splitList.get(i);
			SendThread sendThread = new SendThread(list);
			//4.分配发送
			Thread thread = new Thread(sendThread,"线程"+i);
			thread.start();
		}
		
	}
	/*
	 * 初始化数据
	 */
	public static List<Student> init() {
		List<Student> list = new ArrayList<Student>();
		for (int i = 0; i < 100; i++) {
			list.add(new Student("stuId:" + i, "stuName:" + i));
		}
		return list;
	}
	/*
	 * 分批划分数据
	 */
	public static <T> List splitList(List<T> list,int pageSize) {
		List<List<T>> listArray = new ArrayList<List<T>>();
		//计算应分为几批
		int page=(list.size() + (pageSize - 1))/pageSize;
		for (int i = 0; i < page; i++) {//取出每批对应得数据
			List<T> data=new ArrayList<>();
			for (int j = i * pageSize; j < (i + 1) * pageSize; j++) {//批次区间
				data.add(list.get(j));
			}
			listArray.add(data);
		}
		return listArray;
	}
}

/*
 * 定义线程
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
