package objectTest;

public class HashCodeTest {
	public static void main(String[] args) {
		User u1 = new User(10, "sun");
		System.out.println(u1.hashCode());
		NewUser u2 = new NewUser(10, "sunny");
		System.out.println(u2.hashCode());
	}
}
