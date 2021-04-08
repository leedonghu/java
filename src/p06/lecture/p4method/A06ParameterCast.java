package p06.lecture.p4method;

public class A06ParameterCast {
	public static void main(String[] args) {
		int a = 5;
		double b;
		b = a;
		a = (int)b;
		
		MyClass6 o1 = new MyClass6();
		o1.method1(a);
//		o1.method1(b);  double 은 int로 형변환이 되지 않아서 사용불가
		
		o1.method2(b);
		o1.method2(a);  // int 는 double로 자동 형변환됨
	}
}
