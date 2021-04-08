package p06.lecture.p4method;

public class A07ParameterNumber {
	public static void main(String[] args) {
		MyClass7 o1 = new MyClass7();
		o1.method1(5);
		o1.method2(2, 3);
		o1.method3();
		o1.method3(2);
		o1.method3(3, 4, 5);
		o1.method3(new int[] {9, 8, 7});
		
		o1.method4(1.5, 5,6,7);
		
	}
}
