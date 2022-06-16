package dev.ezen.spring.day02_di2;

public class C {
	private A a;
	public C(A a) {
		this.a = a;
	}
	public A getA() {return a;}
}
