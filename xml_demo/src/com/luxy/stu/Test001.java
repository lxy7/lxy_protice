package com.luxy.stu;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.luxy.stu.entity.Classifier;
import com.luxy.stu.entity.Table;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @classDesc:xml���� ����������ȡ�ļ��е�sql�ű�
 * @author: luxy
 * @createTime: 2019��11��5��
 * @email: luxy@primeton.com
 */

public class Test001 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		try {
			Test001 t = new Test001();
			List<Table> li = (List<Table>) t.getTable("System");
			for (int i = 0; i < li.size(); i++) {
				System.out.println("������" + li.get(i).getName());
				System.out.println("����sql:" + li.get(i).getInsertOrUpdate());
				System.out.println("ɾ��sql:" + li.get(i).getDelete());
			}
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();}

	}

	/*
	 * ����ģ��id ��ȡ��ģ���µı���Ϣ
	 */
	public List<?> getTable(String id) throws Exception {
		File file = new File("data.xml");
		Test001 t = new Test001();
		List<Table> tl = new ArrayList<>();
		Element e = t.readXml(file);
		List<Classifier> cl = (List<Classifier>) t.listAllNodes(e);
		for (int i = 0; i < cl.size(); i++) {
			if (cl.get(i).getId().equals(id)) {
				tl = (List<Table>) cl.get(i).getLi();
				break;
			}
		}
		return tl;
	}

	/*
	 * ��ȡ�ļ�Ԫ��
	 */
	public Element readXml(File file) throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(file);
		Element element = document.getDocumentElement();
		return element;

	}

	/*
	 * �����ļ������нڵ�
	 */
	public List<?> listAllNodes(Element element) {
		List<Classifier> li = new ArrayList<Classifier>();
		NodeList classifierNodes = element.getElementsByTagName("classifier");
		for (int i = 0; i < classifierNodes.getLength(); i++) {
			Classifier cf = new Classifier();
			List<Table> tli = new ArrayList<Table>();
			Element cfElement = (Element) classifierNodes.item(i);
			String id = cfElement.getAttribute("id");
			cf.setId(id);
			NodeList childCfNode = cfElement.getChildNodes();
			for (int j = 0; j < childCfNode.getLength(); j++) {
				Table t = new Table();
				if (childCfNode.item(j).getNodeType() == Node.ELEMENT_NODE) {
					Element tElement = (Element) childCfNode.item(j);
					String name = tElement.getAttribute("name");
					t.setName(name);
					NodeList tchildNode = tElement.getChildNodes();
					for (int k = 0; k < tchildNode.getLength(); k++) {
						if (tchildNode.item(k) instanceof Element) {
							Element tchildElement = (Element) tchildNode.item(k);
							if (tchildElement.getNodeType() == Node.ELEMENT_NODE) {// ��ǰ�ڵ�ΪԪ�ؽڵ�
								if (tchildElement.getNodeName().equals("insert_update")) {
									String isql = tchildElement.getTextContent();
									t.setInsertOrUpdate(isql);
								} else if (tchildElement.getNodeName().equals("delete")) {
									String dsql = tchildElement.getTextContent();
									t.setDelete(dsql);
								}
							}
						}
					}
					tli.add(t);
				}
				cf.setLi(tli);
				li.add(cf);
			}
		}
		return li;

	}

}