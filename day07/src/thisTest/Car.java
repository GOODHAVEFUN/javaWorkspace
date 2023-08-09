package thisTest;

public class Car {
	//필드
	String brand;
	String color;
	int price;

	
	//생성자
	public Car() {
//		this("KIA", "Blue", 2400);
		this.brand = "기아";
		//this.color = "Blue";
		//this.price = 2400;
	}
	
	public Car(String brand, int price) {
		this(brand, "black", price);
		this.brand = brand;
		this.price = price;
	}


	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}



}








