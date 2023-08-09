package castingTest2;

/* Car 클래스
 * 필드 speed, price
 * 생성자
 * 메소드 getter, setter
 * 
 * SportsCar 클래스
 * Car 클래스를 상속
 * 필드 topSpeed
 * 생성자
 * 메소드 getter, setter
 * 
 * CastingTask 클래스
 * Car 클래스의 객체를 생성하고 속도와 가격을 설정
 * Car 타입의 변수에 할당하고 출력
 * SportsCar 타입의 변수에 할당하고 최고 속도를 출력
 */

public class Car {
	//필드 speed, price
	private int speed;
	private int price;
	
	//생성자
	public Car(int speed, int price) {
		super();
		this.speed = speed;
		this.price = price;
	}
	
	
	
	//메소드 getter, setter
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	
	
	
	
	
	
}
