package InterTest3;

public interface Inter1 {
	//멤버 : 상수, 추상메소드
	//	+ defalut, static, private 가능
	
	default void printText() {
		System.out.println("Inter1 printText()");
	}
}
