package p09.lecture;

public class A06AnonymousClass {
	public static void main(String[] args) {
		int localVar =3;
//		localVar = 4;
		
		MyInterface i1 = new MyInterface() {
			void method() {
				//field 나 param을 final처럼 쓰거나 final을 써야함
				System.out.println(localVar);
				System.out.println(args);
			}
		};
	}
}
