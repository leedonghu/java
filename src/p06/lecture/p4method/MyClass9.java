package p06.lecture.p4method;

public class MyClass9 {
	//파라미터의 수, 타입, 순서가 다르면 이름이 같아도 다른 메소드
	void method() {
		System.out.println("method()~~");
	}
	
	void method(int i) {
		System.out.println("method(int)");
	}
	
	void method(double i) {
		System.out.println("method(double)");
	}
	
	void method(int i, int j) {
		System.out.println("method(int, int)");
	}
	
	void method(int i, String s) {
		System.out.println("method(int, String)");
	}
	
	void method(String s, int i) {
		System.out.println("method(String, int)");
	}
}
