package p06.lecture.p5static;

public class MyClass3 {
	int i;
	static int j;
	
	static void method1() {
		System.out.println("method1()");
		method3();
		//method4(); static member에서 instance member에 접근 불가능
		//           어느 instance의 method인지 특정할 수 없음
		System.out.println(j);
		//System.out.println(i); 어느 instance의 field인지 특정할 수 없음
		//instance는 각 객체마다 생성되지만
		//static은 하나만 만들어져서 공유함
	}
	
	static void method3() {
		System.out.println("method3()");
	}
	
	void method2() {
		System.out.println("method2()");
		this.method4();
		//this는 인스턴스 멤버 앞에만 쓸 수 있음
		method3(); //instance member 는 static member 접근 가능
	}
	
	void method4() {
		System.out.println("method4()");
	}
}
