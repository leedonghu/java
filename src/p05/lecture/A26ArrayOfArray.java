package p05.lecture;

import java.util.Arrays;

public class A26ArrayOfArray {
	public static void main(String[] args) {
		//그림 10.배열의배열.png
		int[][] arr = new int[2][]; //안쪽 배열의 참조값이 null이 됨
		
		
		System.out.println("arr 길이: " + arr.length);
		for(int[] a : arr) {
			System.out.println(a);
		}
		// 각 원소 할당
		arr[0] = new int[3];
		arr[1] = new int[2];
		
		System.out.println("arr[0] 길이:" + arr[0].length);
		System.out.println("arr[1] 길이:" + arr[1].length);
		
		for(int[] a : arr) {
			System.out.println(Arrays.toString(a));
		}
		
		Object[] oarr = new Object[2];
		oarr[0] = 3;
		oarr[1] = new int[2];
		System.out.println(Arrays.toString(oarr));
		
	}
}
