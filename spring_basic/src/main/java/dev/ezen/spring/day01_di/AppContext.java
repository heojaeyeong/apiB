package dev.ezen.spring.day01_di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//자바클래스를 객체로 등록할 수 있도록 설정클래스로 정의
@Configuration
public class AppContext {
	//Hello클래스를 빈으로 등록
	@Bean
	public Hello hello() {
		return new Hello();
	}
}
