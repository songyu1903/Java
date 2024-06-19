package b_interface;

public class SmartFan implements Fan{

	@Override
	public void on() {
		System.out.println("음성인식으로 전원 켜기");
	}

	@Override
	public void off() {
		System.out.println("음성인식으로 전원 끄기");
	}

	@Override
	public void turbo() {
		System.out.println("터보 모드");
	}
	
}
