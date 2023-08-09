package review;

public class Ex02_1 {
	public static void main(String[] args) {
		String str = "Hello hi hello";
		char[] strArray = str.toCharArray();
		System.out.println(strArray);
		for(char c : strArray) {
			System.out.println(c);
		}
	}
}
