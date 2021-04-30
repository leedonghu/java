package p15.lecture;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class A14Properties {
	public static void main(String[] args) throws Exception {
		Properties props = new Properties();
		String path = "bin/p15/lecture/config1.properties";
		
		props.load(new FileReader(path));
		
		System.out.println(props.get("id"));
		System.out.println(props.get("password"));
		
		String idValue = (String) props.get("id");//object 타입이기 때문에
		String value = props.getProperty("id");
	}
}
