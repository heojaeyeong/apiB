package dev.ezen.spring.day02_di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainForDI {

	public static void main(String[] args) {
		//스프링 설정정보를 저장한 XML 파일의 경로
		String path = "classpath:/META-INF/spring/app-context-ex01.xml";
		//XML기반의 스프링 설정을 하는 스프링 컨테이너 객체(GenericXmlApplicationContext) 생성
		AbstractApplicationContext xml_context = 
				new GenericXmlApplicationContext(path);
		//스프링 컨테이너를 이용해서 B 객체를 주입받음: getBean("참조변수명", 클래스명.class)
		B b = xml_context.getBean("b", B.class);
		b.getA().printInfo();
		xml_context.close();

	}

}
