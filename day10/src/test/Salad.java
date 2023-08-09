package test;

//Food 추상 클래스
//추상 메소드
// calculatePrice()  음식의 가격을 계산하여 반환
//일반 메서드
// display()    
// "주문한 음식: [음식 이름], 가격: [음식 가격]" 음식정보 출력
//
//Burger, Pizza, Salad 클래스
// Food 추상 클래스를 상속하는 서브클래스
// 각 클래스는 추상 메서드를 오버라이딩하여 음식의 가격을 구체적으로 계산
//
//Main 클래스
// Burger, Pizza, Salad 클래스의 인스턴스 생성
// 각 음식의 속성을 설정
// display() 메서드를 호출하여 각 음식의 정보를 출력
// calculatePrice() 메서드를 호출하여 각 음식의 가격을 계산하여 출력

class Salad extends Food {
	private String name;
	private int price;
	private int number;

	Salad(String name, int price,int number) {
		super();
		this.name = name;
		this.price = price;
		this.number= number;
	}

	@Override
	int calculatePrice() {
		// TODO Auto-generated method stub
		return price*number;
	}

	@Override
	String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	int number() {
		// TODO Auto-generated method stub
		return number;
	}
}
