package p02.lecture;

public class A13TypeConversion {
	public static void main(String[] args) {
		// int : 4byte (32bit)
		//float : 4byte (32bit)
		//float 저장법
		//부호비트 1자리
		//지수비트 8자리
		//가수비트 23자리
		//0000 0000 0000 0000 0000 0000 0000 0000
		//정수를 float에 넣을때 float는 정수자리가23자리 밖에 안됨
		//반면에 int는 32자리를 가짐
		int intVar1 = 66977791;
		float floatVar = intVar1;
		
		System.out.println(floatVar); // 값이 달라짐
		
		//double 저장법 ( 8byte )
		//부호비트 1
		//지수비트 11
		//가수비트 52
		//정수 int의 bit 32보다 double의 가수비트 52가 커서 같은값 나옴
		
		double doubleVar1 = intVar1;
		System.out.println(doubleVar1);
	}
}
