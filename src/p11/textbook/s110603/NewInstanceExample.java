package p11.textbook.s110603;

public class NewInstanceExample {
	public static void main(String[] args) {
		try {
//			Class clazz = Class.forName("p11.textbook.s110603.SendAction");
			Class clazz = Class.forName("p11.textbook.s110603.ReceiveAction");
			Action action = (Action) clazz.newInstance(); //object타입으로 리턴하기 때문에 강제 형변환 해야함
			action.execute();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch(InstantiationException e) {
			e.printStackTrace();
		} catch(IllegalAccessException e) {
			e.printStackTrace();
		}
		
	}
}
