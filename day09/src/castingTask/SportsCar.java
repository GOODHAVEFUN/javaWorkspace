package castingTask;

class SportsCar extends Car {


//Car 클래스를 상속
//	필드 topSpeed
//	생성자
//	메소드 getter/setter
	
	private int topSpeed;
	
	public SportsCar(int speed, int price, int topSpeed) {
		super(speed, price);
		this.topSpeed = topSpeed;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
}