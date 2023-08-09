package InterTest;

public class BasicFan2 implements Fan{
	@Override
	public void on() {
		System.out.println("리모컨으로 전원 켜기");
	}

	@Override
	public void off() {
		System.out.println("리모컨으로 전원 끄기");
		
	}

	@Override
	public void turbo() {
		System.out.println("터보");
	}
}
