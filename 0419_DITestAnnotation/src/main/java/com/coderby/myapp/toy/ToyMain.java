package com.coderby.myapp.toy;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.coderby.myapp.toy.controller.ToyController1;
import com.coderby.myapp.toy.controller.ToyController2;

public class ToyMain {

	public static void main(String[] args) {
		//bean container와 main간 통신을 위한 context 변수 생성
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("application-config.xml");
		
		//getBean 메서드는 첫 번째에 xml파일 내의 id, 두 번째는 실제 클래스 파일의 이름.class
		ToyController1 toy = context.getBean("toyController1", ToyController1.class);
		
		toy.playToy();
		
		//context는 다 사용했으면 .close()로 메모리 회수
		context.close();
	}
}
