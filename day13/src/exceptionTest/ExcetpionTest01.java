package exceptionTest;

import java.util.Scanner;

public class ExcetpionTest01 {
	public static void main(String[] args) {
		Scanner sc = null;
		
		try {
			sc.next();
			System.out.println("실행시키고 싶은 명령어1");
			//try블록에서 오류 발생한다면
			//발생한 오류 객체를 받을 수 있는 참조변수를 가진 catch문 영역이 실행된다
		} catch(NullPointerException e) { //부모클래스 Exception 클래스
//			System.out.println("null이에요");
//			System.out.println(e);
			//java.lang.NullPointerException: 
			//Cannot invoke "java.util.Scanner.next()" because "sc" is null
//			System.out.println(e.getMessage());
			//Cannot invoke "java.util.Scanner.next()" because "sc" is null
			e.printStackTrace();
		} catch(Exception e) {
			// 우리가 try에서 어떤 오류가 발생할지 전부 예상하기 힘들다
			// 예상치 못한 오류가 발생할 수도 있다
			// 예상치 못한 오류를 잡기 위해서 Exception 타입의 매개변수를 사용한다
			// 모든 예외의 조상은 Exception 클래스이다
			// 즉, 어떤 예외가 발생하더라도 Exception 타입의 참조변수에 저장가능한다(업캐스팅)
			System.out.println("예상치 못한 오류");
		}
		System.out.println("실행시키고 싶은 명령어2");
		
//		Exception in thread "main" java.lang.NullPointerException: 
//			Cannot invoke "java.util.Scanner.next()" because "sc" is null
//		at exceptionTest.ExcetpionTest01.main(ExcetpionTest01.java:9)
	}
}
















