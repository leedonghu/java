package p06.textbook.exercise.ex18;

public class ShopService {
	private static ShopService shopservice;
	
	private ShopService() {
		
	}
	static ShopService getInstance() {
		if(shopservice == null) {
			shopservice = new ShopService();
		}
		return shopservice;
	}
}
