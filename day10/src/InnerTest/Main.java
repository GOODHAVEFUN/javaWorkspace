package InnerTest;

public class Main {
	public static void main(String[] args) {
		//OuterClass의 인스턴스 생성
		OuterClass o = new OuterClass();
		System.out.println(o); //참조값
		
		//OuterClass의 참조변수 o를 이용해서 InstanceInner클래스의 
		//인스턴스를 생성
		OuterClass.InstanceInner ii = o.new InstanceInner();
		System.out.println(ii);
		
		//OuterClass의 인스턴스를 생성하고 그 인스턴스를 이용해서
		//InstanceInner 클래스의 인스턴스를 생성
		OuterClass.InstanceInner ii2 = new OuterClass().new InstanceInner();
		System.out.println(ii2);
		
		//Static 클래스의 인스턴스를 생성
		OuterClass.StaticInner si = new OuterClass.StaticInner();
		System.out.println(si);
	}
}















