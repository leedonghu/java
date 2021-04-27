package p13.textbook.s130701;

import java.util.Arrays;

public class ChildProductAndStorageExample {
	public static void main(String[] args) {
		ChildProduct<Tv, String, String> product = new ChildProduct<Tv, String, String>();
		product.setKind(new Tv());
		product.setModel("smartTV");
		product.setCompany("samsung");
		
		Storage<Tv> storage = new StorageImp1<Tv>(100);
		storage.add(new Tv(), 0);
		Tv tv = storage.get(0);
		
		System.out.println(Arrays.toString(tv));
	}
}
