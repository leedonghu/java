package p02.lecture;

public class A06TypeLong {
	public static void main(String[] args) {
		//long : 8byte(64bit)
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		//최댓값 : 9223372036854775807
		//최솟값 : -9223372036854775808
		
		long longVar;
//		longVar = 9223372036854775807; // 정수는 int 범위까지만 표현됨
		longVar = 9223372036854775807L; // 마지막에 L을 붙여서 long의 값을 자길수 있게 함
		longVar = -9223372036854775808L; // 마지막에 L을 붙임
//		longVar = -9223372036854775809L; // NOT OK
//		longVar = 9223372036854775808L; // NOT OK
		
		longVar = 1_000_000; //숫자가 클때는  _ 사용
	}
}
