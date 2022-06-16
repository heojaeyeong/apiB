package dev.ezen.spring.day02_di2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//자바클래스를 객체로 등록할 수 있도록 설정클래스로 정의
@Configuration
public class AppContext {
	
	@Bean
	public A a() {
		return new A();
	}

	@Bean
	public B b() {
		return new B(a());
	}
	
	@Bean
	public C c() {
		return new C(a());
	}
}
