package spring;

public class SwimmingPool implements Facility {
	
	private int Price;
	private String Age;
	
	public SwimmingPool(int Price, String Age) {
		this.Price=Price;
		this.Age=Age;
		System.out.println("SwimmingPool 생성자 호출");
	}
	
	@Override
	public void play() {
		System.out.println("수영장에서 놀고있습니다.");
	}

	public void setPrice(int price) {
		Price = price;
	}
	public void setAge(String age) {
		Age = age;
	}
	
	public void connect() {
		System.out.println("connect() 메서드 호출");
	}
	public void disconnect() {
		System.out.println("disconnect() 메서드 호출");
	}
	
}
