package p11.lecture.arrays;

import java.util.Arrays;

public class A02ArraysSort {
	public static void main(String[] args) {
		int[] arr1 = {29, 1, 1, 51, 198, 188, 5, 0};
		
		System.out.println(Arrays.toString(arr1));
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		String[] arr2 = {"java", "eva", "python", "good"};
		
		System.out.println(Arrays.toString(arr2));
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
	}
}
