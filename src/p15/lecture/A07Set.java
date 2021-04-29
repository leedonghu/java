package p15.lecture;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class A07Set {
	public static void main(String[] args) {
		//set : 순서없고 중복불가
		Set<Integer> set = new HashSet<>();
		
		set.add(9);
		set.add(8);
		set.add(2);
		
		System.out.println(set.size());
		
		set.add(9);
		System.out.println(set.size());
		
		boolean c = set.contains(9);
		System.out.println(c);
		System.out.println(set.contains(3));
		
		set.remove(9);
		System.out.println(set.size());
		
		set.add(3);
		set.add(2);
		set.add(9);
		System.out.println(set.size());
		
		Iterator<Integer> iter = set.iterator();
		
		
//		System.out.println(iter.hasNext());
//		Integer i1 = iter.next();
//		System.out.println(iter.hasNext());
//		Integer i2 = iter.next();
//		System.out.println(iter.hasNext());
//		Integer i3 = iter.next();
//		System.out.println(iter.hasNext());
//		Integer i4 = iter.next();
//		
//		System.out.println(iter.hasNext());
//		Integer i5 = iter.next();
		
		while(iter.hasNext()) {
			Integer n = iter.next();
			System.out.println(n);
		}
		
	}
}
