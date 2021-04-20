package p11.textbook.exercise.ex03;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}
	
	@Override
	public int hashCode() {
		return Integer.parseInt(studentNum);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s1 = (Student)obj;
			if(this.studentNum == s1.studentNum) {
				return true;
			}
		}
		return false;
	}
}
