package practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PracticeExample {
	static Scanner scanner = new Scanner(System.in);
	static Set<String> set1 = new HashSet<>();
	static Set<Integer> set2 = new HashSet<>();
	public static void main(String[] args) {
		
		boolean run = true;

		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.책등록|2.읽은 책 목록|3.책 비용|4.비용 비교|5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택>");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				registerBook();
			} else if (selectNo == 2) {
				bookList();
			} else if (selectNo == 3) {
				bookPrice();
			} else if (selectNo == 4) {
				comparePrice();
			} else if (selectNo == 5) {
				run = false;
			}
		}
	}

	private static void comparePrice() {
		int i = bookPrice();
		if(i<10000) {
			System.out.println("옷");
		}else if(i<20000) {
			System.out.println("치킨");
		}else if(i<30000) {
			System.out.println("피자 치킨 세트");
		}else if(i<40000) {
			System.out.println("스테이크");
		}else if(i<50000) {
			System.out.println("악세서리");
		}else if(i<100000) {
			System.out.println("비행기 티켓");
		}else  {
			System.out.println("책을 많이 읽으시는 군요");
		}
	}

	private static int bookPrice() {
		int i=0;
		for(int io : set2) {
			i += io;
			
		}
		System.out.println(i);
		return i;
	}

	private static void bookList() {
		for(String str : set1) {
			System.out.println(str);
		}
	}

	private static void registerBook() {
		System.out.println("---------");
		System.out.println("책 등록");
		System.out.println("---------");
		
		
		System.out.print("책이름:");
		String bookName = scanner.next();
		System.out.println();
		System.out.print("책 가격:");
		int bookPrice = scanner.nextInt();
		Book book = new Book(bookName, bookPrice);
		set1.add(bookName);
		set2.add(bookPrice);
		
	}
}
