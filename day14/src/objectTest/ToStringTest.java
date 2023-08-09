package objectTest;

public class ToStringTest {
	//필드, 생성자, 메소드
	public ToStringTest() {
		super();
	}
	
	public static void main(String[] args) {
		String str = "aa";
		ToStringTest tt = new ToStringTest();
		System.out.println(str);
		System.out.println(tt);
		System.out.println(str.toString());
		System.out.println(tt.toString());
		
		try {
			throw new NumberFormatException("안녕~~~!!!!");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}




















