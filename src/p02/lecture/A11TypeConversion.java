package p02.lecture;

public class A11TypeConversion {
	public static void main(String[] args) {
		//정수: byte, short, int, long
		byte byteVar1 = 100;
		short shortVar1 = byteVar1;
		int intVar1 = shortVar1;
		intVar1 = byteVar1;
		
		long longVar1 = intVar1;
		longVar1 = shortVar1;
		longVar1 = byteVar1;
		
		////////////////////
		int intVar2 = 100;
		short shortVar2 = 100;
//		shortVar2 = intVar2; // x
		shortVar2 = (short)intVar2; // 강제 형변환(type casting)
		System.out.println(shortVar2); // 원하는 값 나오지 않을 수 있음
	}
}
