package p06.lecture.p4method;

public class A09Parameter {
	
	//method overloading
	//메소드명이 같아도 파라미터의 타입, 순서, 개수가 다르면 다른 메소드
	public static void main(String[] args) {
		MyClass9 o1 = new MyClass9();
		
		o1.method();
		o1.method(0);
		o1.method(3.14);
		o1.method(0, "hello");
		o1.method(3, 4);
		o1.method("Hello", 3);
	}
}
