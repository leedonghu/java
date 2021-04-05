package p05.lecture;

import java.util.Arrays;

public class A25ArrayOfArray {
	public static void main(String[] args) {
		//그림: 09.배열의 배열.png
		int[][] arr = new int[2][3];
		arr[1][1]=9;
		arr[0][2]=8;
		
		for(int[] elem : arr) {
			System.out.println(Arrays.toString(elem));
		}
	}
}
