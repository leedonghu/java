package p07.lecture.p5final;

public final class Child extends Parent{
	@Override
	public void method1() {
		System.out.println("method1 child");
	}
	
	public void method2() {
		//재정의 안됨
	}
}
