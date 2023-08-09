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

public class SportsCar extends Car {
	//필드 topSpeed
	private int topSpeed;

	//생성자
	public SportsCar(int speed, int price, int topSpeed) {
		super(speed, price);
		this.topSpeed = topSpeed;
	}
	
	//메소드 getter, setter
	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	
	
	
	
	

}
