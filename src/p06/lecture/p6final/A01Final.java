package p06.lecture.p6final;

public class A01Final {
	
	//final field 는 꼭 정의되어야함
	//변하지않는 상수를 정할때 주로 사용
	//관습적으로 대문자씀
	final static int f;
	static final double PI = 3.1415;
	
	
	static {
		f=55;
	}
	
	int a;
	final int b;
	
	A01Final(){
		this.b = 9;
	}
	
	public static void main(String[] args) {
		//final 변수(지역변수, 파라미터, 필드)는 
		//값을 한 번만 할당 받을 수 있음
		
		final int i;
		int j;
		j=3;
		j=5;
		
		i=9;
//		i=10; final이 붙어있기 때문에 한번만 할당 받을 수 있음
		
	}
	static void method1(final int i) {
		System.out.println(i);
		//i = 3;
	}
}
