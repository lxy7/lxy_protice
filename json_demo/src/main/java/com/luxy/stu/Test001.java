/**
 * 
 */
package com.luxy.stu;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.luxy.stu.entity.Classes;
import com.luxy.stu.entity.Grade;

/**
 * @classDesc: json���ݽ���
 * @author: luxy
 * @createTime: 2019��11��4��
 * @email: luxy@primeton.com
 */
public class Test001 {
	
		public static void main(String[] args) {
		 //����json�ַ���
	    String json="{\"id\":\"001\",\"name\":\"�����꼶\",\"manager\":\"������\",\"classesList\":"
	    		+ "[{\"classId\":\"00101\",\"cName\":\"����(1)��\",\"cManager\":\"������\"},"
	    		+ "{\"classId\":\"00102\",\"cName\":\"����(2)��\",\"cManager\":\"������\"},"
	    		+ "{\"classId\":\"00103\",\"cName\":\"����(3)��\",\"cManager\":\"������\"}]}";
		//��ת����jsonObject
		JSONObject jsonObject=new JSONObject().parseObject(json);
		String id=jsonObject.getString("id");
		String name=jsonObject.getString("name");
		String manager=jsonObject.getString("manager");
		System.out.println(id+"---"+name+"---"+manager);
		System.out.println("�༶��Ϣ����:"+"\n"+"����������������������������������������������");
		JSONArray jsonArray =jsonObject.getJSONArray("classesList");
		for (int i = 0; i < jsonArray.size(); i++) {
			String classId=jsonArray.getJSONObject(i).getString("classId");
			String cName=jsonArray.getJSONObject(i).getString("cName");
			String cManager=jsonArray.getJSONObject(i).getString("cManager");
			System.out.println(classId+"---"+cName+"---"+cManager);
		}
		//jsonת������
		Grade grad=new JSONObject().parseObject(json, Grade.class);
		System.out.println("jsonת������:"+"\n"+grad.toString());
	}

}
