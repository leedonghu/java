package p15.lecture;

import java.util.ArrayList;
import java.util.List;

public class A02List {
	//List : 순서가 있고 중복 저장 가능
	//       인터페이스여서 직접 인스턴스 만들지 못함
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		//add : 값 추가
		
		list.add("java");
		list.add("spring");
		list.add("python");
//		list.add(3); 위에서 String으로 명시했기 때문에
		
		//size : 크기
		int len = list.size();
		System.out.println(len);
		
		//get : 꺼내기
		String e1 = list.get(0);
		String e2 = list.get(1);
		String e3 = list.get(2);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
//		String e4 = list.get(4); 예외 발생
		
		//for 탐색
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			
			
		}
		
		//향상된 for 탐색
		System.out.println("향상된 for 탐색");
		for(String e : list) {
			System.out.println(e);
		}
		
		//remove : 삭제
		list.add("servlet");
		System.out.println("지우기 전 for 탐색");
		for(String e : list) {
			System.out.println(e);
		}
		list.remove(3);
		System.out.println("지운 후 for 탐색");
		for(String e : list) {
			System.out.println(e);
		}
		
		list.add("object");
		System.out.println("지우기 전 for 탐색");
		for(String e : list) {
			System.out.println(e);
		}
		
		list.remove("java");
		System.out.println("지운 후 for 탐색");
		for(String e : list) {
			System.out.println(e);
		}
		
		
	}
}
