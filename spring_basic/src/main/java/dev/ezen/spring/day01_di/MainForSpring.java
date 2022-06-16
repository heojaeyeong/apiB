package dev.ezen.spring.day01_di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
//수정합니다.
public class MainForSpring {

	public static void main(String[] args) {
		//애노테이션을 이용해서 환경설정하는 스프링 컨테이너: AnnotationConfigApplicationContext
		//스프링컨테이너 객체 생성
		AbstractApplicationContext context = 
				new AnnotationConfigApplicationContext(AppContext.class);
		
		Hello hello = context.getBean("hello", Hello.class);
		//hello: 스프링 빈의 참조 변수, 언제 정의한 것일까요? 빈등록할 때 주었던 메소드 이름
		
		hello.setGreeting("Hello, Spring!");
		System.out.println(hello.getGreeting());
		context.close();
	}

}

