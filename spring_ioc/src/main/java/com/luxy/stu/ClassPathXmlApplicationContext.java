/**
 * 
 */
package com.luxy.stu;

import java.lang.reflect.Field;
import java.util.List;
import java.util.MissingFormatArgumentException;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * @classDesc:采用反射和dom4j解析xml实现spring ioc
 * @author: luxy
 * @createTime: 2019年11月7日
 * @email: luxy@primeton.com
 */
public class ClassPathXmlApplicationContext {
	private String path;
	private static final String ID="id";
	private static final String CLASS="class";
	private static final String NAME="name";
	private static final String VALUE="value";

	/**
	 * @param path
	 */
	public ClassPathXmlApplicationContext(String path) {
		super();
		this.path = path;
	}
	
	public Object getBean(String id){
		if(id==null||id.equals("")){
			return null;
		}
		SAXReader saxReader = new SAXReader();
		Object instance = null;
		try {
			//读取xml文件
			Document  doc=saxReader.read(this.getClass().getClassLoader().getResource(path));
			//获取根节点
			Element root =doc.getRootElement();
			//获取根节点下的子节点
			List<Element> elements=root.elements();
			//遍历子节点
			for(Element element :elements){
				List<Attribute> attributes =element.attributes();
				String classId=element.attributeValue(ID);//获取类ID
				if(!classId.equals(id)){//属性值不符合，结束本次循环
					continue;
				}
				String classPath=element.attributeValue(CLASS);//获取类路径
				//System.out.println(classId+" = "+classPath );
				//采用反射初始化类
				Class<?> forName=Class.forName(classPath);
			    instance=forName.newInstance();
			    //获取子节点 类属性
			    List<Element> childElements=element.elements();
			    for(Element childElement : childElements ){
			    	String name=childElement.attributeValue(NAME);//获取类属性名称
			    	String value=childElement.attributeValue(VALUE);//获取属性值
			    	Field field=forName.getDeclaredField(name);
			    	field.setAccessible(true);
			    	field.set(instance, value);
			    }
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return instance;
	}

	

}
