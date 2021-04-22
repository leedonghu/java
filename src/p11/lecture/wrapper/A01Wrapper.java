package p11.lecture.wrapper;

public class A01Wrapper {
	public static void main(String[] args) {
		//8개 기본타입
		//나머지는 참조타입
		
		//Wrapper class들 기본타입과 매치되는 참조타입
		//Byte, Short, Integer, Long
		//Character, Boolean
		//Float, Double
		
		Integer i1 = new Integer(100);
		System.out.println(i1.toString());
		System.out.println(i1.hashCode());
		System.out.println(System.identityHashCode(i1));
		
		Object[] arr1 = new Object[] {"java", 3, true, 3.14, 'a'};
		
		Object o1 = new Integer(3); // boxing
		Object o2 = 3; // 자동으로 boxing
		
//		int intVar1 = o1; object 는 int가 아님
		
		Integer i2 = new Integer(99);
		int intVar2 = i2;// 자동으로 unboxing
		
		intVar2 = i2.intValue(); // 수동으로 unboxing
	}
}
