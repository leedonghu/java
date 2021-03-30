package p03.lecture.p2unary.p3logical;

public class A03Logical {
	public static void main(String[] args) {
		//and &&, & (논리곱)
		//or ||, | (논리합)
		//xor ^ (배타적 논리합)
		//not ! (단항연산자에서 살펴봄)
		
		//and &&, &
		//양변의 결과 boolean
		//양변이 모두 true일 때만 true, 나머지 모두 false
		System.out.println(true&&true); // true
		System.out.println(true&&false); // false
		System.out.println(false&&true); // false
		System.out.println(false&&false); // false
		
		System.out.println(true&true); // true
		System.out.println(true&false); //false
		System.out.println(false&true); // false
		System.out.println(false&false); //false
		
		//short circuit
		
		int i = 3;
		System.out.println(true && (i++) > 0); // true
		System.out.println(i);
		
		System.out.println(false && (i++)> 0); // false
		System.out.println(i); //앞쪽이 false 일때는 뒤쪽과 상관없이
		                       // false 임으로 뒤쪽 건너뜀
		                       // && 일때만 &일때는 아님
		                       //short circuit
		
		System.out.println(false & (i++) > 0); //false, short circuit 진행하지 않음
		System.out.println(i); // 5
		
		// or: ||, |
		// 양변이 false 일 때만 false
		// 나머지 모두 true
		System.out.println(true||true); //true
		System.out.println(true||false); //true
		System.out.println(false||true); //true
		System.out.println(false||false); // false
		
		System.out.println(true|true);
		System.out.println(true|false);
		System.out.println(false|true);
		System.out.println(false|false);
		
		
		// xor ^ (exclusive or)
		// 두 항의 값이 다를 때만 true
		// 두 항의 값이 같으면 false
		
		System.out.println("xor");
		System.out.println(true ^ true);//false
		System.out.println(true ^ false); //true
		System.out.println(false ^ true); //true
		System.out.println(false ^ false); //false
	}
}
