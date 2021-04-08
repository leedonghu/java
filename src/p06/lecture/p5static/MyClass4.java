package p06.lecture.p5static;

public class MyClass4 {
	int i = 3;
	int j;
	
	static int a = 30;
	static int b;
	
	static {
		//static field 초기화
		//jvm이 클래스를 읽을때 실행
		b = 50;
		System.out.println("static block");
	}
	
	static {
		System.out.println("static block2");
	}
	
	MyClass4(){
		//인스턴스 필드를 초기화
		this.j = 5;
	}
}
