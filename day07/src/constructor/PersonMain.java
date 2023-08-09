package constructor;

public class PersonMain {
	public static void main(String[] args) {

		Person pr1 = new Person();
		System.out.println(pr1);
		System.out.println(pr1.name);
		System.out.println(pr1.age);
		
		pr1.name = "짱구";
		pr1.age = 5;
		pr1.address = "서울시";
		
		System.out.println(pr1.name);
		
		Person pr2 = new Person("철수", 5, "부산시");
		System.out.println(pr2.name);
		
		Person pr3 = new Person("훈이");
		System.out.println(pr3.name);
		
		pr1.getName();
		pr2.getName();
	}
}















