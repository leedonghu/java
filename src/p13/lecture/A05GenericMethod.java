package p13.lecture;

public class A05GenericMethod {
	public static void main(String[] args) {
		MyClass5 o1 = new MyClass5();
		o1.<String>method1();
		o1.<String>method2("java");
		o1.method2("spring");//컴파일러가 추론해서 <String>생략
		o1.<String>method3();
		
		String s = o1.method3(); // String으로 받기때문에<String>생략
		
	}
}

class MyClass5{
	public <T> void method1() {
		
	}
	public <T> void method2(T param) {
		
	}
	public <T> T method3() {
		return null;
	}
}
