package thisTest;

public class CarMain {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car("현대", "White", 6500);
		Car car3 = new Car("BMW", 5000);
		
		System.out.println(car1.brand);
		System.out.println(car2.brand);
		System.out.println(car3.brand);
		System.out.println(car3.color);
	}
}
