package p06.lecture.p8access_modifier;

import p06.lecture.p8access_modifier.package1.MyClass1;

public class A02AccessModifierExample {
	public static void main(String[] args) {
		MyClass1 o1 = new MyClass1();
	//	System.out.println(o1.j); j는 private이기 때문에 접근 불가능
		System.out.println(o1.i); // i는 public 이기 때문에 접근 가능
	//	System.out.println(o1.k); 다른 패키지기 때문에 default k 접근 불가
	}
}
