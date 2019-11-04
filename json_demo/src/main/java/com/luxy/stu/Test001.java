/**
 * 
 */
package com.luxy.stu;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.luxy.stu.entity.Classes;
import com.luxy.stu.entity.Grade;

/**
 * @classDesc: json数据解析
 * @author: luxy
 * @createTime: 2019年11月4日
 * @email: luxy@primeton.com
 */
public class Test001 {
	
		public static void main(String[] args) {
		 //定义json字符串
	    String json="{\"id\":\"001\",\"name\":\"高三年级\",\"manager\":\"王俊峰\",\"classesList\":"
	    		+ "[{\"classId\":\"00101\",\"cName\":\"高三(1)班\",\"cManager\":\"李莉莉\"},"
	    		+ "{\"classId\":\"00102\",\"cName\":\"高三(2)班\",\"cManager\":\"刘婷婷\"},"
	    		+ "{\"classId\":\"00103\",\"cName\":\"高三(3)班\",\"cManager\":\"苏明明\"}]}";
		//先转化成jsonObject
		JSONObject jsonObject=new JSONObject().parseObject(json);
		String id=jsonObject.getString("id");
		String name=jsonObject.getString("name");
		String manager=jsonObject.getString("manager");
		System.out.println(id+"---"+name+"---"+manager);
		System.out.println("班级信息如下:"+"\n"+"———————————————————————");
		JSONArray jsonArray =jsonObject.getJSONArray("classesList");
		for (int i = 0; i < jsonArray.size(); i++) {
			String classId=jsonArray.getJSONObject(i).getString("classId");
			String cName=jsonArray.getJSONObject(i).getString("cName");
			String cManager=jsonArray.getJSONObject(i).getString("cManager");
			System.out.println(classId+"---"+cName+"---"+cManager);
		}
		//json转换对象
		Grade grad=new JSONObject().parseObject(json, Grade.class);
		System.out.println("json转换对象:"+"\n"+grad.toString());
	}

}
