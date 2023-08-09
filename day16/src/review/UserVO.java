package review;

public class UserVO {
//	- 아이디, 비밀번호, 이름, 나이
//	- 모든 필드는 private으로 선언하고 생성자를 통해서만 초기화한다
//	- toString()을 재정의하여 모든 필드의 값을 확인할 수 있도록한다
//	- 모든 필드의 getter메소드를 만든다
	
	//필드
	private String id;
	private String pw;
	private String name;
	private int age;
	
	//생성자
	public UserVO(String id, String pw, String name, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}

	//getter 메소드
	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "id = " + id + "\npw = " + pw + "\nname= " + name + 
			"\nage = " + age;
	}
}
