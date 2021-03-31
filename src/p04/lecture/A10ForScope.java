package p04.lecture;

public class A10ForScope {
	public static void main(String[] args) {
		
		int a =10;
		System.out.println(a);
		
		int i;
		for ( i=0; i<5; i++) {
			System.out.println(i);
		}
		System.out.println(i); //변수는 선언된 code block 안에서만 사용
		                       //밖에서는 안됨
		                       //밖에서도 쓰고싶다면 밖에서 선언
	}
}
