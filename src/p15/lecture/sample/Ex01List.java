package p15.lecture.sample;

import java.util.Arrays;
import java.util.List;

public class Ex01List {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(7, 9, -100, 30, 90, 500);
		
		System.out.println(list);
		
		int sum = sum(list);
		System.out.println(sum);
		
		int max = max(list);
		System.out.println(max);
		
		int indexOfMax = indexOfMax(list);
		System.out.println(indexOfMax);
		System.out.println(list.get(indexOfMax));
	}

	public static int indexOfMax(List<Integer> list) {
		int first = list.get(0);
		int max = 0;
		int index = 0;
		for(int i=0; i<list.size(); i++) {
			if(first<list.get(i)) {
				max = list.get(i);
				index = i;
			}
		}
//		int index = list.indexOf(max);
		return index;
	}

	public static int max(List<Integer> list) {
		int first = list.get(0);
		int max = 0;
		for(int i=0; i<list.size(); i++) {
			if(first<list.get(i)) {
				max = list.get(i);
			}
		}
		return max;
	}

	public static int sum(List<Integer> list) {
		int sum1 = 0;
		for(int i : list) {
			sum1 += i;
		}
		return sum1;
	}
}
