package objectTest;

public class EqualsTest02 {
	public static void main(String[] args) {
		User user = new User(1, "sun");
		System.out.println(user);
		System.out.println(user.toString());
		
		NewUser nUser = new NewUser(1, "sun");
		System.out.println(nUser);
		System.out.println(nUser.toString());
		
		System.out.println(user.equals(nUser));
		System.out.println(user.equals(user));
		
	//유저 번호가 같다면 같은 유저로 판단한다
		NewUser nu1 = new NewUser(1, "sun");
		NewUser nu2 = new NewUser(100, "sun");
		System.out.println(nu1 == nu2);
		System.out.println(nu1.equals(nu2));
	}
}
















