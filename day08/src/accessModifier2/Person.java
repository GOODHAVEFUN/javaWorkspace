package accessModifier2;

public class Person {
	//필드
	//private 이름, 나이
	private String name;
	private int age;
	String name2;
	int age2;
	
	//생성자(매개변수2)
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//메소드
	public void sayHello() {
		System.out.println("제 이름은 " + name + "이고, 나이는 "+ age + "입니다");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
