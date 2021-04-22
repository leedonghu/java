package p11.lecture.regex;

import java.util.regex.Pattern;

public class A01RegularExpression {
	//정규표현식
	//문자열의 패턴을 표현하는 문자열
	//meta-character, quantifier
	
	
	public static void main(String[] args) {
		String regex1 = "a";
		String str1 = "a";
		
		boolean p1 = Pattern.matches(regex1, str1);//a라는 string은 a라는 패턴과 일치
		
		System.out.println(p1);
		
		regex1 = "java";
		str1 = "java";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "9";
		str1 = "0";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\d"; // 숫자 하나 라는 의미
		str1 = "8";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\d";
		str1 = "89"; //숫자 2개여서 false
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\d\\d"; //연속된 숫자 2개
		str1 = "67";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\d{3}"; // 중괄호안에 있는 숫자는 바로 앞의 패턴이 몇번 반복되어야 하는지 표현
		str1 = "123";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\d{3,}"; //3개 이상
		str1 = "123465";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "010-\\d{4}-\\d{4}";
		str1 = "010-9876-3333";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\d{3,5}"; //숫자 3, 4, 5 개 인정
		str1 = "22"; // 2개여서 false
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\d+"; // \d{1,} 한개이상
		str1 = "1";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\d*"; // \d{0,} 0개이상
		str1 = "a"; //알파벳이어서 false
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\d?"; // \d{0,1} 
		str1 = "";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "010-?\\d{4}-?\\d{4}";
		str1 = "010-9876-3333";
		String str2 = "01098763333";
		String str3 = "010-98763333";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		
		regex1 = "\\w";
		str1 = "s";
		str2 = "T";
		str3 = "8";
		String str4 = "_";
		String str5 = " ";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		System.out.println(Pattern.matches(regex1, str4));
		System.out.println(Pattern.matches(regex1, str5));
		
		regex1 = "\\w\\d+";
		str1 = "e123456";
		str2 = "123456";
		str3 = "_123465";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		
		regex1 = "(java)";
		str1 = "java";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "(java)+";
		str1 = "javajava";
		str2 = "javajavaj";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		
		regex1 = "(java|python)";
		str1 ="java";
		str2 = "python";
		str3 = "spring";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		
		regex1 = "(java|python)+";
		str1 = "java";
		str2 = "python";
		str3 = "pythonjavajavapython";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		
		regex1 = "."; //모든 문자 . 만 표현하고 싶을때는 \\.
		str1 = "$";
		str2 = ".";
		str3 = "a";
		str4 = "9";
		str5 = "_";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		System.out.println(Pattern.matches(regex1, str4));
		System.out.println(Pattern.matches(regex1, str5));
		
		regex1 = "[abc]";// a, b, c만 가능
		str1 = "a";
		str2 = "b";
		str3 = "d";
		str4 = "ab";//false
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		System.out.println(Pattern.matches(regex1, str4));
		
		regex1 = "[^abc]"; //a,b,c만 빼고
		str1 = "c";
		str2 = "a";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		
		regex1 = "[a-z]"; //범위
		str1 = "A"; //대문자여서 false
		str2 = "a";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		
		regex1 = "[a-zA-Z]";
		str1 = "a";
		str2 = "A";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		
		regex1 = "[가-힣]";
		str1 = "김";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "[가-힣]+";
		str1 = "가나다라바";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\p{IsHangul}+";
		str1 = "ㅂㅈㄷㅁㄴㅇㄳㅎ";
		System.out.println(Pattern.matches(regex1, str1));
	}
}
