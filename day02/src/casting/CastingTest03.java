package casting;

public class CastingTest03 {
	public static void main(String[] args) {
		
		//문자열은 +가 연산이 아닌 연결
		System.out.println(4 + 5); //연산
		System.out.println("4" + "5"); //연결
		
		//다른 자료형 -> 문자열 형변환
		
		String intStr = 10 + "";
		String longStr = 10L + "";
		String douStr = 10.1 + "";
		String floatStr = 10.5f + "";
		String charStr = '가' + "";
		String boolStr = true + "";
		
		System.out.println(intStr + longStr + douStr + floatStr);
		
	}
}
















