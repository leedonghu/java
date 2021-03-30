package p03.lecture.p2unary.p4bit;

public class A03BitShiftRight {
	public static void main(String[] args) {
		// >> : 왼쪽을 부호비트 채움
		// >>>: 왼쪽을 0으로 채움
		
		// 1111 1111 1111 1111 1111 1111 1001 1101
		int a = -99;
		
		// a >> 1
		// 1111 1111 1111 1111 1111 1111 1100 1110
		System.out.println(a >> 1);
		
		// a >>> 1
		// 0111 1111 1111 1111 1111 1111 1100 1110
		System.out.println(a >>> 1);
		
	}
}
