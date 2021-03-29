package p03.lecture.p2unary.arithmetic;

public class A05StringConcat {
	public static void main(String[] args) {
		int a =3;
		int b =9;
		
		int c = a+b;
		System.out.println(c);
		
		//String: 문자열 ""
		String str1 = "java";
		String str2 = "spring";
		String str3 = str1+str2;
		System.out.println(str3);
		
		String str4 = str1 + a;
		System.out.println(str4);//문자열 + 숫자. 문자열이 있으면 문자열로 계산
		
		String str5 = str1 + a + b;
		System.out.println(str5);//+는 순서대로 이루어짐. java39
		
		String str6 = a + b + str1;
		System.out.println(str6);//12java
		
		String str7 = a + (b+str1);
		System.out.println(str7);//39java
	}
}
