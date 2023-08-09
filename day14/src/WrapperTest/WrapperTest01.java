package WrapperTest;

public class WrapperTest01 {
	public static void main(String[] args) {
		//boxing
		Integer num1 = new Integer(3);
		Integer num2 = Integer.valueOf(3);
		Double num3 = new Double(1.5);
		Double num4 = Double.valueOf(1.5);
		
		//unboxing
		int num5 = num1;
		System.out.println(num5);
		
		double num6 = num4;
		System.out.println(num6);
		System.out.println(num5 + num6);
		
		//auto boxing, auto unboxing
		Integer numInt1 = 5;
		System.out.println(numInt1);
		
		int num7 = numInt1;
		System.out.println(num7);
		
	}
}












