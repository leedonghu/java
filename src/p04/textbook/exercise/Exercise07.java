package p04.textbook.exercise;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int balance =0;
		int balance1 =0;
		
		
		while(run) {
			
			
			System.out.println("---------------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("---------------------------");
			System.out.print("선택> ");
			
			int userNumber = scanner.nextInt();
			
			if(userNumber == 1) {
				
				System.out.print("예금액> ");
				int userNumber2 = scanner.nextInt();
				balance += userNumber2;
				System.out.println();
				
			}else if (userNumber == 2) {
				
				System.out.print("출금액> ");
				int userNumber3 = scanner.nextInt();
				balance1 = (balance - userNumber3);
				System.out.println();
				
			}else if (userNumber == 3) {
				
				System.out.print("잔고> ");
				System.out.println(balance1);
				System.out.println();
				
			}else if (userNumber == 4) {
				run = false;
				
				
			}
			
		}
		scanner.close();
		System.out.println();
		System.out.println("프로그램 종료");
		
		
	}
}
