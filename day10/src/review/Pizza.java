package review;

public class Pizza extends Food{

	public Pizza(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculatePrice() {
		return 25000;
	}
	
}
