package review;

public class Main {
	public static void main(String[] args) {
		
		Burger bu = new Burger("치즈버거");
		Pizza pi = new Pizza("불고기피자");
		
		bu.display();
		
		System.out.println("햄버거 가격 : " + bu.calculatePrice());
		
	}
}
