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
 * @classDesc:���÷����dom4j����xmlʵ��spring ioc
 * @author: luxy
 * @createTime: 2019��11��7��
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
			//��ȡxml�ļ�
			Document  doc=saxReader.read(this.getClass().getClassLoader().getResource(path));
			//��ȡ���ڵ�
			Element root =doc.getRootElement();
			//��ȡ���ڵ��µ��ӽڵ�
			List<Element> elements=root.elements();
			//�����ӽڵ�
			for(Element element :elements){
				List<Attribute> attributes =element.attributes();
				String classId=element.attributeValue(ID);//��ȡ��ID
				if(!classId.equals(id)){//����ֵ�����ϣ���������ѭ��
					continue;
				}
				String classPath=element.attributeValue(CLASS);//��ȡ��·��
				//System.out.println(classId+" = "+classPath );
				//���÷����ʼ����
				Class<?> forName=Class.forName(classPath);
			    instance=forName.newInstance();
			    //��ȡ�ӽڵ� ������
			    List<Element> childElements=element.elements();
			    for(Element childElement : childElements ){
			    	String name=childElement.attributeValue(NAME);//��ȡ����������
			    	String value=childElement.attributeValue(VALUE);//��ȡ����ֵ
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
