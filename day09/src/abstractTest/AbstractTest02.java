package abstractTest;

public class AbstractTest02 {
	public static void main(String[] args) {
		//객체화 작업(인스턴스화)
		Animal cat = new Cat(); //업캐스팅
		Animal dog = new Dog(); //업캐스팅
		
		cat.crying();
		dog.crying();
	}
}
