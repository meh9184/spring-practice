package com.coderby.myapp.toy;

import org.springframework.context.support.GenericXmlApplicationContext;
import com.coderby.myapp.toy.controller.ToyController;

public class ToyMain {

	public static void main(String[] args) {
		
		String path[] = {"application-config.xml", "application-config-battery.xml"};
		
		//bean container�� main�� ����� ���� context ���� ����
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext(path);
		
		//getBean �޼���� ù ��°�� xml���� ���� id, �� ��°�� ���� Ŭ���� ������ �̸�.class
		ToyController toy = context.getBean("toyController", ToyController.class);
		
		toy.playToy();
		
		//context�� �� ��������� .close()�� �޸� ȸ��
		context.close();
	}
}