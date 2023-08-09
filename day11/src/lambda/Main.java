package lambda;

public class Main {
	public static void main(String[] args) {
		FunctrionalInter fi = new FunctrionalInter() {
			
			@Override
			public void method() {
				System.out.println("익명 객체의 메소드 재정의");
				
			}
		};
		fi.method();
		
		FunctrionalInter fii = () -> System.out.println("람다식");
		fii.method();
				
	}
}





















