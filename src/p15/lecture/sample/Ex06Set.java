package p15.lecture.sample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex06Set {
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5, 2, 3};
		int[] arr2 = {1, 2, 3, 4};
		
		int sum1 = sum(arr1);
		int sum2 = sum(arr2);
		System.out.println(sum1);
		System.out.println(sum2);
	}

	public static int sum(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for(int i=0; i<nums.length; i++) {
			set.add(nums[i]);
		}
		int sum = 0;
		for(Integer s : set) {
			sum += s;
		}
		
//		Iterator<Integer> iter = set.iterator();
//		while(iter.hasNext()) {
//			sum += iter.next();
//		}
		
//		for(Iterator<Integer> iter = set.iterator(); iter.hasNext(); ) {
//			sum += iter.next();
//		}
		
		return sum;
	}
}
