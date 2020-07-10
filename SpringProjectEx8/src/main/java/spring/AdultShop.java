package spring;

public class AdultShop implements Facility {

	private int Price;
	private String Age;
	
	public AdultShop(int Price, String Age) {
		this.Price=Price;
		this.Age=Age;
		System.out.println("AdultShop 생성자 호출");
	}
	
	@Override
	public void play() {
		System.out.println("성인용품점에서 놀고있습니다.");
	}
	
	public void setPrice(int price) {
		Price = price;
	}
	public void setAge(String age) {
		Age = age;
	}
}
