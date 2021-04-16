package p09.lecture;

public class A01NestedClassExample {
	public static void main(String[] args) {
		A01NestedClass.StaticClass o1 = new A01NestedClass.StaticClass(); 
		//STATIC CLASS는 바로접근가능

		//A01NestedClass.InnerClass o2 = new A01NestedClass.InnerClass();
		A01NestedClass outer1 = new A01NestedClass();
		A01NestedClass.InnerClass o3 = outer1.new InnerClass();
		//static class가 아니면 바로접근할 수 없고 instance 만든 후에 접근
	}
}
