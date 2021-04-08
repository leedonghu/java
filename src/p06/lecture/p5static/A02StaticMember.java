package p06.lecture.p5static;

public class A02StaticMember {
	public static void main(String[] args) {
		MyClass2.i = 5;
		System.out.println(MyClass2.i);
		
		MyClass2.method();
		
		MyClass2 o1 = new MyClass2();
		o1.j = 10;
		
		MyClass2 o2 = new MyClass2();
		o2.j = 20;
		
		System.out.println(o1.j);
		System.out.println(o2.j);
		
		o1.i = 9;
		
		//class member는 같은 인스턴스를 공유
		System.out.println(o1.i);
		System.out.println(o2.i);
		System.out.println(MyClass2.i);
	}
}
