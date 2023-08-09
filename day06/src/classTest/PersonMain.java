package classTest;
//1. 사용자 정의 타입이다(자료형)
public class PersonMain {
	public static void main(String[] args) {
		//Person 클래스의 객체 생성
		Person pr = new Person();
		System.out.println(pr);
		Person pr2 = new Person();
		System.out.println(pr2);
		
		System.out.println(pr2.name); //null
		System.out.println(pr2.age);	//0
		
		//객체에 값 할당
		pr.name = "김영선";
		pr.age = 20;
		
		pr2.name = "짱구";
		pr2.age = 5;
		
		//값 출력
		System.out.println(pr.name);
		System.out.println(pr.age);
		
		System.out.println(pr2.name);
		System.out.println(pr2.age);
	}
}














