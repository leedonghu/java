package p02.lecture;

public class A05TypeInt {
	public static void main(String[] args) {
		
		//int : 4byte(32bit)
		
		//십진법 0 : 0000 0000 0000 0000 0000 0000 0000 0000
		//       1 : 0000 0000 0000 0000 0000 0000 0000 0001
		//       2 : 0000 0000 0000 0000 0000 0000 0000 0010
		// .....
		//2,147,483,647 : 0111 1111 1111 1111 1111 1111 1111 1111
		//-2,147,483,648 : 1000 0000 0000 0000 0000 0000 0000 0000
		//       -1 : 1111 1111 1111 1111 1111 1111 1111 1111 1111
		//        0 : 1 0000 0000 0000 0000 0000 0000 0000 0000 0000 // 맨 앞의 1 사라짐
		
		int intVar;
		intVar = 0;
		intVar = 2147483647;
//		intVar = 2147483648; // not ok
		intVar = -2147483648; 
//		intVar = -2147483649; //not ok
		
		//16진법: 0 ~ F
		//2진법 : 0000 ~ 1111
		//10진법 : 0 ~ 15
		
		// css color : rgb(255, 255, 255)
		//           : #FFFFFF
		
		intVar = 255;
		System.out.println(intVar);
		intVar = 0xFF; // 16진법
		System.out.println(intVar);
		intVar = 0377; // 8진법
		System.out.println(intVar);
	}
}
