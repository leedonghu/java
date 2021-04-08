package p06.lecture.p5static;

public class MyClass2 {
	//static member 는 인스턴스를 만들지 않고도 사용가능
	//class field(=static field)
	static int i;
	
	//instance field
	int j;
	
	//class method(=static method)
	static void method() {
		System.out.println("method()");
	}
	
	//instance method
	void method1() {
		System.out.println("method1()");
	}
}
