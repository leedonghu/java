package p06.lecture.p7package;

import p06.lecture.p7package.package2.MyClass2;
import p06.lecture.p7package.package1.MyClass1;

public class A02Package {
	public static void main(String[] args) {
//		p06.lecture.p7package.package1.MyClass1 o1 
//		= new p06.lecture.p7package.package1.MyClass1();
		//원래는 풀네임을 적어야함
		MyClass1 o1 = new MyClass1();
		
		MyClass2 o2 = new MyClass2();
		//그냥 쓰고싶으면 위에 import필요
		
		MyClass3 o3 = new MyClass3();
	}
}
