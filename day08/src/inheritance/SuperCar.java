package inheritance;

public class SuperCar extends Car{
	//Car 상속받는 SuperCar 클래스
		//필드 boolean booster
		//생성자 매개변수로 모두 다 받는 생성자
		//메소드
		//boosterOn => 부스터 on
		//boosterOff => 부스터 off
	boolean booster;

	public SuperCar(String brand, String color, int price, boolean booster) {
		super(brand, color, price);
		this.booster = booster;
	}
	
	void boosterOn() {
		System.out.println("부스터 on");
	}
	void boosterOff() {
		System.out.println("부스터 off");
	}

	//메소드 오버라이딩
	@Override
	void enginStart() {
		System.out.println("시동on");
	}

	@Override
	void enginStop() {
		System.out.println("시동off");
	}
}








