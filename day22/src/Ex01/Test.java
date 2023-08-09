package Ex01;

public class Test {
	public static void main(String[] args) {
		String lineSeparator = System.lineSeparator();
		//시스템 줄바꿈 문자열을 반환하는 java 클래스의 공용 정적 메소드
		//텍스트파일에서 줄바꿈할 때 사용되는 개행문자를 검색하는 
		//플랫폼 독립적인 방법을 제공
		// \r\n
		System.out.println("Hello" + lineSeparator + "java");
	}
}
