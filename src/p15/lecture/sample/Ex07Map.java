package p15.lecture.sample;

import java.util.HashMap;
import java.util.Map;

public class Ex07Map {
	public static void main(String[] args) {
		int[] arr1 = {1, 1, 1, 3, 3, 2, 3, 2, 1, 4, 5, 5};
		
		Map<Integer, Integer> map = count(arr1);
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() +":" + entry.getValue());
		}
	}

	public static Map<Integer, Integer> count(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int num : nums) {
			if(map.containsKey(num)) {
				int cnt = map.get(num);
				map.put(num, cnt+1);
			}else {
				
				map.put(num, 1);
			}
		}
		return map;
	}
}
