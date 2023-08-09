package datatype;

public class CastingTest3 {

	public static void main(String[] args) {
		//다른 자료형 -> 문자열 형변환
		int intStr1 = 10;
		long longStr1 = 10L;
		System.out.println(intStr1 + longStr1); //연산
		
		String intStr = 10 + "";
		String longStr = 10L + "";
		String douStr = 10.5 + "";
		String floStr = 10.5F + "";
		String charStr = '가' + "";
		String boolStr = false + "";
		
		System.out.println(intStr + longStr + douStr + floStr + charStr + boolStr);
		
		//문자열 -> 다른 자료형 형변환
		int num1 = Integer.parseInt(intStr);
		int num2 = Integer.parseInt("100");
		System.out.println(num1 + num2);
		
		long num3 = Long.parseLong(longStr);
		System.out.println(num2 + num3);
		
		double num4 = Double.parseDouble(douStr);
		System.out.println(num3 + num4);
		
		float num5 = Float.parseFloat(floStr);
		
		char spell = "Apple".charAt(4); //charAt() 소괄호안에는 인덱스 번호를 넣어줘야함
										//인덱스의 첫시작번호는 0부터 시작함
		System.out.println(spell);
		
		boolean bool1 = Boolean.parseBoolean(boolStr);
		boolean bool2 = Boolean.parseBoolean("true");
//		System.out.println(bool1 + bool2); //연산 , 연결(문자열)

	}
}











