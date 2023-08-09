package castingTest;

public class CastingTest {
	public static void main(String[] args) {
		//up casting
		SmartTv smartTv = new SmartTv();
		//자료형	참조변수	= 생성자;
		Tv tv = new Tv();
		
		//1. up casting
		Tv tv1 = (Tv)smartTv;
		
		smartTv.netflix(); //자식 클래스의 객체-> 자식클래스의 멤버 호출 가능
		tv.chUp();	//부모 클래스의 객체 -> 자식클래스의 멤버는 호출 불가능, 부모클래스의 멤버만 호출 가능
		tv1.chDown();//up casting -> 자식클래스의 멤버는 호출 불가능, 부모 클래스의 멤버만 호출 가능
		
		//2. up casting
		Tv tv2 = (Tv)new SmartTv(); 
		tv2.powerOnOff(); //부모 클래스 타입의 참조 변수에 자식 클래스타입의 객체를 강제형변환 참조한다
		
		//3. up casting
		Tv tv3 = new SmartTv();
		//부모클래스 타입의 참조 변수에 자식클래스 타입의 객체의 주소값(참조값)을 저장한다
		tv3.chUp();
		
		//Down casting
		//업캐스팅된 객체가 있어야된다
		SmartTv st1 = (SmartTv)tv3;
		st1.netflix();
		
		//잘못된 Down casting
		//업캐스팅된 객체가 없을 때, 부모클래스 객체를 자식클래스의 객체로 만들때 오류발생
		Tv parents = new Tv();
		SmartTv child = (SmartTv)parents; //오류발생
//		child.netflix();
		
	}
}











