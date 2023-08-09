package casting;

public class CastingTest02 {
	public static void main(String[] args) {
		//강제 형변환
		int intVar = 1;
		double douVar = 10.5;
		boolean boVar = true;
		char chVar = 'A';
		
		System.out.println("------int-----");
		System.out.println((double)intVar);
//		System.out.println((boolean)intVar);
		System.out.println((char)intVar);
		
		System.out.println("------double-----");
		System.out.println((int)douVar); //소수점이하자리가 절삭되고 강제 형변환
		System.out.println((char)douVar);
//		System.out.println((boolean)douVar);

		System.out.println("------char-----");
		System.out.println((int)chVar);
		System.out.println((double)chVar);
//		System.out.println((boolean)chVar);
	}
}
















