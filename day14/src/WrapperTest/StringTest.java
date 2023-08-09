package WrapperTest;

public class StringTest {
	public static void main(String[] args) {
		//String 클래스의 메소드
		
		String msg = "안녕하세요";
		
		//charAt()
		System.out.println(msg.charAt(3));
		
		//indexOf()
		System.out.println(msg.indexOf("안"));
		System.out.println(msg.indexOf("다"));

		//split()
		String msg2 = "안 녕 하 세 요";
		System.out.println(msg2);
		String[] ar = msg2.split(" "); //배열
		for(String i : ar) {
			System.out.print(i);
		}
		
		//length()
		System.out.println("\n"+msg2.length());
		
		//substring(start, end)
		System.out.println(msg2.substring(0, 4));
		
		//strip()
		String msg3 = "                 안   녕   하  세  요            ";
		System.out.println(msg3);
		System.out.println(msg3.length());
		System.out.println(msg3.strip());
		
	}
}














