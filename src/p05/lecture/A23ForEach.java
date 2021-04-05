package p05.lecture;

public class A23ForEach {
	public static void main(String[] args) {
		//for each
		//향상된 for문
		int[] arr1 = {3, 4, 5, 6};
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		//for each
		for(int n : arr1) {
			System.out.println(n);
		}
		
		String[] arr2 = {"java", "asds", "qwer"};
		String t = "";
		for(String n : arr2) {
			t += n;
		System.out.println(t);
		}
//		System.out.println(t);
	}
}
