package p15.lecture;

import java.util.Iterator;
import java.util.TreeSet;

public class A15TreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		
		set.add(100);
		set.add(50);
		set.add(200);
		set.add(30);
		set.add(300);
		set.add(310);
		
		for(int n : set) {
			System.out.println(n);
		}
		
		System.out.println(set.first());//이진트리 가장 왼쪽, 가장 작은값
		System.out.println(set.last());//이진트리 가장 오른쪽, 가장 큰 값
		
		System.out.println(set.lower(210));//210기준으로 가장 큰 것
		System.out.println(set.higher(210));//210기준으로 큰것중에 가장 작은것
		
		Iterator<Integer> di = set.iterator();
		while(di.hasNext()) {
			System.out.println(di.next());
		}
	}
}
