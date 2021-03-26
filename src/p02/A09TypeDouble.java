package p02;

public class A09TypeDouble {
	public static void main(String[] args) {
		//double: 8byte(64bit) 실수 저장
		
		double v = 3.14; // 실수 literal은 double
		
		//양의 최댓값
		System.out.println(Double.MAX_VALUE);
		
		//양의 최솟값
		System.out.println(Double.MIN_VALUE);
		
		//음의 최솟값
		System.out.println(-Double.MAX_VALUE);
		
		//음의 최댓값
		System.out.println(-Double.MIN_VALUE);
		
		//양의 무한대
		System.out.println(Double.POSITIVE_INFINITY);
		
		//음의 무한대
		System.out.println(Double.NEGATIVE_INFINITY);
		
		// NaN
		System.out.println(Double.NaN);
	}
}
