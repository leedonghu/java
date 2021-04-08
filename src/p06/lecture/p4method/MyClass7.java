package p06.lecture.p4method;

import java.util.Arrays;

public class MyClass7 {
	void method1(int i ) { 
		System.out.println("method1!!");
	}
	
	void method2(int i, int j) {
		System.out.println("method2@@");
		System.out.println(i);
		System.out.println(j);
	}
	
	//varargs : 0개 이상의 parameter
	//배열로 사용됨
	void method3 (int... i) {
		System.out.println("method3##");
		System.out.println(i.length);
		System.out.println(Arrays.toString(i));
	}
	
	//다른 parameter랑 쓰일때는 맨 뒤에 쓰여야 함
	void method4 (double d ,int... i) {
		System.out.println("method4$$");
	}
}
