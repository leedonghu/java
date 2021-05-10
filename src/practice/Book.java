package practice;

import java.util.HashMap;
import java.util.Map;

public class Book {
	private String name;
	private int price;
	
	public Book(String name, int price) {
		Map<String, Integer> map = new HashMap<>();
		map.put(name, price);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
