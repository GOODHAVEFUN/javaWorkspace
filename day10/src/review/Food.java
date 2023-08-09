package review;

public abstract class Food {
	//필드
	String name;

	//생성자
	public Food(String name) {
		super();
		this.name = name;
	}
	
	//추상메소드
	public abstract int calculatePrice();
	
	//일반메소드
	public void display() {
		System.out.println("주문한 음식 : " + name + ", 가격 : " + calculatePrice());
	}
}

















