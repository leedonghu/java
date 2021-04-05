package p05.lecture;

import java.util.Arrays;

public class A20ArrayCopy {
	public static void main(String[] args) {
		int[] arr1 = {9, 7 ,5, 3, 1};
		int[] arr2;
		arr2 = arr1;  //arr1 의 참조값을 arr2에 저장
		
		System.out.println(arr2[0]);
		arr2[0] =10;
		System.out.println(arr2[0]);
		System.out.println(arr1[0]);
		
		//배열 복사
		int[] arr3 = new int[arr1.length];
		for(int i=0; i<arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		//복사 후
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr3));
		
		arr3[0] = 11;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr3)); // arr1과 arr3은
		                                           // 다른 참조값 가지고 있음
		                                           // arr3을 바꿔도 arr1은 바뀌지 않음
	}
}
