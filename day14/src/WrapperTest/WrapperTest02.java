package WrapperTest;

public class WrapperTest02 {
	public static void main(String[] args) {
		int number = 10;
		System.out.println(number);
		
		Integer num1 = new Integer(number);
		System.out.println(num1);
		System.out.println(number);
		
		int unbnum = num1.intValue();
		//Integer 클래스의 객체를 int 타입으로 변환
		System.out.println(unbnum);
		
		
	
	}
}
