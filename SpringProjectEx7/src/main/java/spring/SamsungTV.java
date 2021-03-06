package spring;

public class SamsungTV implements TV{
	
	private SonySpeaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("===> SamsungTV(1) 객체 생성");
	}
	public SamsungTV(SonySpeaker speaker) {
		System.out.println("===> SamsungTV(2) 객체 생성");
		this.speaker=speaker;
	}
	public SamsungTV(SonySpeaker speaker, int price) {
		System.out.println("===> SamsungTV(3) 객체 생성");
		this.speaker=speaker;
		this.price=price;
	}
	@Override
	public void powerOn() {
		System.out.println("SamsungTV---전원 켠다.");
	}
	@Override
	public void powerOff() {
		System.out.println("SamsungTV---전원 끝다");
	}
	@Override
	public void powerUp() {
		speaker.volumeUp();
	}
	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}
	public int getPrice() {
		return price;
	}
	
}
