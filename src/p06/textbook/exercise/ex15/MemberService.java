package p06.textbook.exercise.ex15;

public class MemberService {
	String id;
	String password;
	
	boolean login(String id, String password) {
		this.id = id;
		this.password = password;
		if(id == "hong" && password == "12345") {
			return true;
		}else {
			return false;
		}
	}
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
