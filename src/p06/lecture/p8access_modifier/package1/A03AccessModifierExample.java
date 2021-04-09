package p06.lecture.p8access_modifier.package1;

public class A03AccessModifierExample {
	public static void main(String[] args) {
		MyClass1 o1 = new MyClass1();
		System.out.println(o1.i);
	//	System.out.println(o1.j);    private 이기 때문에 사용 불가
		System.out.println(o1.k); // 같은 패키지 안에서는 사용가능 default
	}
}
