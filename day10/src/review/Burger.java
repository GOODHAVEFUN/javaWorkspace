package review;

public class Burger extends Food{
	//생성자
	public Burger(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	//메소드 오버라이딩
	@Override
	public int calculatePrice() {
		return 5000;
	}
	
}
