package constructor;

public class Person {
	//필드
	String name;
	int age;
	String address;

	//생성자 : alt + shift + s + o
	public Person() {
		
	}

	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public Person(String name) {
		this.name = name;
	}
	
	//메소드
	void getName() {
		System.out.println("이름 : " + name);
	}
}












