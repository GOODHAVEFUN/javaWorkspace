package castingTask;

class Car {
	//필드 speed, price
//	생성자
//	메소드 getter/setter
	
	private int speed, price;

	public Car(int speed, int price) {
		super();
		this.speed = speed;
		this.price = price;
	}

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
