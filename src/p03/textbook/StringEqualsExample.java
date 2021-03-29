package p03.textbook;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		String strVar3 = new String("신민철");
		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		System.out.println();
		System.out.println(strVar1.equals(strVar2)); //string 의 요소를 비교하고 싶을때는 equals 메소드 사용
		System.out.println(strVar1.equals(strVar3));
	}
}
