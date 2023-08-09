package inheritance;

public class Main {
	public static void main(String[] args) {
		//Tv 객체 => sTv
		Tv sTv = new Tv();
		System.out.println(sTv.power);
		sTv.powerOnOff();
//		sTv.mode(); 자식클래스에 있는 메소드기 때문에 부모클래스로 만든 객체로는 접근 불가
		
		//Tv2 객체 => lTv
		Tv2 lTv = new Tv2();
		System.out.println(lTv.power);
		lTv.powerOnOff();
		lTv.mode();
		
		//SmartTV 객체 => nTv
		SmartTv nTv = new SmartTv();
		System.out.println(nTv.power);
		
		
		
		
	}
}















