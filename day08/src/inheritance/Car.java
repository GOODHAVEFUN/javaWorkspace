package inheritance;

public class Car {
	//필드
	//brand, color, price
	String brand;
	String color;
	int price;

	
	//생성자
	//기본생성자, 매개변수3개있는 생성자
	public Car() {
		super();
	}
	
	public Car(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	//메소드
	//enginStart() =>시동이 켜졌습니다 출력
	//enginStop()	=> 시동이 꺼졌습니다 출력
	void enginStart() {
		System.out.println("시동이 켜졌습니다");
	}
	void enginStop() {
		System.out.println("시동이 꺼졌습니다");
	}
}














