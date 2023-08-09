package exceptionTest;

public class ExceptionTest02 {
	public static void main(String[] args) {
//		int num1 = 10, num2 = 0;
//		try {
//			int result = num1 / num2;
//			System.out.println(result);
//		} catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		
		try {
			divideNum(10, 0);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("0으로 나누기 끝");
	}
		
	
	public static void divideNum(int num1, int num2) throws Exception{
		if(num2 == 0) {
			System.out.println("0으로 나눌수 없습니다");
		}
		
		System.out.println(num1 / num2);
	}
}

	
	
	
	
	
	
	
	
	
	
	
	