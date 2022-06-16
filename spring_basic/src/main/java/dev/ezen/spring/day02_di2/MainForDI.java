package dev.ezen.spring.day02_di2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainForDI {

	public static void main(String[] args) {
		//애노테이션 기반의 스프링 설정을 하는 스프링 컨테이너 객체(AnnotationConfigApplicationContext) 생성
		AbstractApplicationContext ann_context = 
				new AnnotationConfigApplicationContext(AppContext.class);
		
		//스프링 컨테이너를 이용해서 B 객체를 주입받음: getBean("참조변수명", 클래스명.class)
		B b = ann_context.getBean("b", B.class);
		b.getA().printInfo();
		
		ann_context.close();

	}

}
