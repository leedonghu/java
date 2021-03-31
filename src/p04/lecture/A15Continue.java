package p04.lecture;

public class A15Continue {
	public static void main(String[] args) {
		// continue : loop의 나머지 코드를 실행하지 않고 계속진행
		
		for(int i=0; i<10; i++) {
			if((i%2)==0) {
				continue;
				
			}
			System.out.println(i); //짝수일때 나머지코드 실행하지 않음
			                       //홀수일때 continue를 만나지 않아서 실행됨
		}
	}
}
