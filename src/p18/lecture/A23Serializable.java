package p18.lecture;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class A23Serializable {
	public static void main(String[] args) throws Exception {
		String path = "src/p18/lecture/output10.txt";
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(new Car());//0과1의 조합으로 나열되어야 stream을 통과함->serial
		                           // instance 를 직렬화, 나열화 Serializable 인터페이스 구현
		
		
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Car c = (Car) ois.readObject();//역 직렬화 deserialization
		System.out.println(c);
		ois.close();
	}
}



class Car implements Serializable{
	private String name;
	private int id;
}

