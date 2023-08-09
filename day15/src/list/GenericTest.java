package list;

class MyClass<T>{ //T라는 타입 매개변수를 가진 제네릭 클래스
	//필드
	T data;

	//생성자
	public MyClass(T data) {
		super();
		this.data = data;
	}
		
	//메소드
	void printData() {
		System.out.println(data);
	}
}

public class GenericTest {
	public static void main(String[] args) {
		MyClass<String> mc = new MyClass<>("안녕");
		mc.printData();
		MyClass<Integer> mc2 = new MyClass<>(59);
		mc2.printData();
		
		
	}
}