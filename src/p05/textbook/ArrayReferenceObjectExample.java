package p05.textbook;

public class ArrayReferenceObjectExample {
	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "java";
		strArray[1] = "java";
		strArray[2] = new String("java");
		
		System.out.println(strArray[0]==strArray[1]);
		System.out.println(strArray[0]==strArray[2]);
		System.out.println(strArray[0].equals(strArray[2]));
		
		String[][] str = new String[3][1];
		str[0][0]= "java";
		str[1][0]= "java";
		str[2][0]= new String("java");
		System.out.println(str[0]==str[1]);
		System.out.println(str[0]==str[2]);
		System.out.println(str[0].equals(str[2]));
		System.out.println(str[0][0]==str[1][0]);
		System.out.println(str[0][0]==str[2][0]);
		System.out.println(str[0][0].equals(str[2][0]));
	}
}
