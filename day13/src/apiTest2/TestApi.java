package apiTest2;

public class TestApi {
	/** API 주석
	 * 
	 * div 메소드는 정수인 파라미터를 받으며 num1과 num2를 나눠준다
	 * 
	 * @param num1 : 첫번째 정수
	 * @param num2 : 두번째 정수
	 * @since JDK 11
	 * 
	 * example)
	 * <br>
	 * div(10, 3)
	 * <br>
	 * 10과 3을 나눈 결과를 출력한다
	 * 
	 * @throws ArithmeticException
	 *			산술연산 중에 발생하는 예외(정수를 0으로 나누기 등)
	 * @see {@link Math}
	 * 
	 */
	
	public void div(int num1, int num2) throws ArithmeticException{
		System.out.println(num1 / num2);
	}
	
}


















