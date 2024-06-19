package b_interface;

public class BasicFan extends FanAdapter{

	@Override
	public void on() {
		System.out.println("버튼으로 전원 켜기");
	}
	
	
	@Override
	public void off() {
		System.out.println("버튼으로 전원 끄기");
	}

	
}
