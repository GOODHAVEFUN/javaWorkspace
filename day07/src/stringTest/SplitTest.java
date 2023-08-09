package stringTest;

public class SplitTest {
	public static void main(String[] args) {
//		String test = "Java Programming";
//		String[] word = test.split(" ");

		String test = "abc,def,ghi";

		String[] word = test.split("c");
//		System.out.println(word[0]);
//		System.out.println(word[1]);
		for(String i : word) {
			System.out.println(i);
			
		}
	}
}
