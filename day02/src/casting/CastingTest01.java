package casting;

public class CastingTest01 {
	public static void main(String[] args) {
		
		//int -> char 문자형만 자동형변환 가능
//		int intNum1 = 10L;
//		int intNum2 = 2.1;
//		int intNum3 = 2.1F;
		int intNum4 = 'A';
//		int intNum5 = true;
		
		System.out.println(intNum4);
		
		//long -> int, char 자동형변환 가능
		long longNum1 = 10;
//		long longNum2 = 10.1;
//		long longNum3 = 10.1f;
		long longNum4 = 'A';
//		long longNum5 = true;
		
		//double -> int, long, float, char 자동형변환 가능
		double douNum1 = 10;
		double douNum2 = 10L;
		double douNum3 = 10.7F;
		double douNum4 = 'A';
//		double douNum5 = true;
		
		//float -> int, long, char 자동형변환 가능
		float flNum1 = 10;
		float flNum2 = 10L;
//		float flNum3 = 10.5;
		float flNum4 = 'A';
//		float flNum5 = ture;
		
		
		char spell1 = 65;
		System.out.println(spell1);
		spell1 = 97;
		System.out.println(spell1); //a
		
//		char spell2 = 100000;
//		char spell3 = 65L;
//		char spell4 = 65.5;
//		char spell5 = 65.5f;
//		char spell6 = true;
		
		System.out.println("hello" + spell1); //문자열 + 문자 = 문자열+문자
		System.out.println(5 + 10); //정수 + 정수 = 정수
		System.out.println(5 + 10.5); //정수 + 실수 = 실수
		System.out.println('A' + 1); //문자 + 정수 = 정수
		
	}
}
















