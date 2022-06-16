package dev.ezen.spring.day02_di2;

public class B {
	private A a;
	public B(A a) {
		this.a = a;
	}
	public A getA() {return a;}

}
