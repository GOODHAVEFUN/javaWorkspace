package apiTest2;

public class Test {
	public static void main(String[] args) {
		TestApi ta = new TestApi();
		
		try {
			ta.div(10, 3);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		TestApi ta2 = new TestApi();
		try {
			ta2.div(10, 0);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}
}
