package p03.lecture.p2unary.p2compare;

public class A03CompareString {
	public static void main(String[] args) {
		String a = "abc";
		String b = "def";
//		System.out.println(a < b); //string 타입끼리 비교연산 안됨
		
		char c = 'a';
		char d = 'b';
		
		System.out.println(c < d);
		
		// 동등한가(==), 동등하지 않은가(!=)
		String str1 ="java";
		String str2 = "java";
		System.out.println(str1 == str2);
		
		String str3 = "ja";
		String str4 = "va";
		String str5 = str3 + str4;
		System.out.println(str1);
		System.out.println(str5);
		
		System.out.println(str1 == str5); // false
		
		//문자열이 같은지 확인하는 메소드
		//equals
		
		str1.equals(str5);
		System.out.println(str1.equals(str5)); //true
		
		
	}
}
