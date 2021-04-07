package p06.lecture.p4method;

public class MyClass2 {
	int a;
	
	void method1(int b) {
		int c = 99;
		int a = 10000;
		System.out.println("this.a: " + this.a); //필드의 변수는 자동 초기화
		System.out.println("a: " + a); //필드의 변수와 메소드의 변수가 같을때는 더 가까운 메소드 변수를 인식
		System.out.println("b: " + b); //메소드 호출될 때 초기화
		System.out.println("c: " + c); //메소드 안의 변수는 초기화해야함
	}
}
