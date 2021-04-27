package p15.lecture.sample;

import java.util.ArrayList;
import java.util.List;

public class Ex04List {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("java", 100));
		list.add(new Student("spring", 200));
		list.add(new Student("servlet", 150));
		list.add(new Student("jsp", 70));
		list.add(new Student("html", 90));
		list.add(new Student("css", 170));
		
		Student max = maxScore(list);
		System.out.println(max.getName() + ":" + max.getScore() );
		
		int sum = sumScore(list);
		System.out.println(sum);
		
		
	}

	private static int sumScore(List<Student> list) {
		int sum = 0;
		for(int i=0; i<list.size(); i++) {
			sum += list.get(i).getScore();
		}
		return sum;
	}

	private static Student maxScore(List<Student> list) {
		
//		int first = list.get(0).getScore();
//		int max = 0;
//		String name =null ;
//		if(first<list.get(i).getScore()) {
//			
//			for(int i=0; i<list.size(); i++) {
//				
//				max = list.get(i).getScore();
//				name = list.get(i).getName();
//				
//			}
//		}
		
		Student s = null;
		int max1 =list.get(0).getScore();
		
		for(Student stu : list) {
			if(stu.getScore()>max1) {
				s = stu;
				max1 = stu.getScore();
			}
		}
		
		
		
		
		return s;
	}
}


class Student{
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	
}
