package classTest;

public class CalcMain {
	public static void main(String[] args) {
		//클래스의 객체 생성
		Calc c = new Calc(); //더하기 기능만 사용
		Calc c1 = new Calc(); //곱하기 기능만 사용
		
		//메소드 호출
		System.out.println(c.add(10, 20));
		System.out.println(c1.mul(5, 4));
		
	}
}
