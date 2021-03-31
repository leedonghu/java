package p04.textbook;

public class ForPrintFrom1To10Example {
	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
			
			System.out.println(i);
		}
		
		
		//1~10홀수
		System.out.println("1~10홀수");
		for(int i=0; i<5; i++) {
			System.out.println(2*i+1);
		}
		
		//1~10짝수
		System.out.println("1~10짝수");
		for(int i =1; i<=5; i++) {
			System.out.println(2*i);
		}
		
		//10~1
		System.out.println("10~1");
		for(int i = 10; i>0; i--) {
			System.out.println(i);
		}
		
		
		//10~1짝수
		System.out.println("10~1짝수");
		for(int i=5; i>0; i--) {
			System.out.println(2*i);
		}
		
		
		//10~1홀수
		System.out.println("10~1홀수");
		for(int i=5; i>=1; i--) {
			System.out.println(2*i-1);
		}
	}
}
