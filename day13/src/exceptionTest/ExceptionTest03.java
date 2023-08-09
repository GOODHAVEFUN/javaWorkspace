package exceptionTest;

public class ExceptionTest03 {
	public static void main(String[] args) {
		String number = "abcd";
		
		try {
			Integer.parseInt(number);
		}catch(NumberFormatException e) {
			System.out.println("유효하지 않은 숫자입니다");
			e.printStackTrace();
		}
	}
}
