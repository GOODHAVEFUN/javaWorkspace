package classTest;

public class CarMain {
	public static void main(String[] args) {
		//Car 클래스의 객체 생성
		Car c1 = new Car();
		
		//객체 메소드 호출
		c1.drive();
		
		c1.brand = "BMW";
		c1.color = "red";
		
		c1.drive();
	}
}
