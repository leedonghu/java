package p02.lecture;

public class A07TypeChar {
	public static void main(String[] args) {
		//char : 2byte(8bit)
		//문자 저장
		//javascript
		//var a = "a";
		//    a = "가";
		
		//java 문자열
		String s1 = "hello";//2개 문자 이상, 문자열일때 string
		s1 = "자바";
		s1 = "자";
		s1 = "a";
		s1 = "";
		
		//java 문자 (1개)
		char charVar;
//		charVar = "a"; //not ok 큰따옴표 쓰면 안됨
		charVar = 'a'; // char literal. 0과1의 조합. unicode
		charVar = '눈';
		System.out.println(charVar);
		charVar = '\uB208'; //'눈'의 유니코드 
		System.out.println(charVar);
		
		charVar = 45576;//B208을 10진법으로
		System.out.println(charVar);
		
//		charVar = ''; // not ok 빈 공백 안됨
		charVar = '\u10E6';
		System.out.println(charVar);
	}
}
