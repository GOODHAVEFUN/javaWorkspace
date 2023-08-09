package lambdaTask;

public class LambdaTask {
	public static void main(String[] args) {
		//lambdaTask 패키지 만들고
		//LambdaTask 클래스 생성(main 메소드 추가)
	
		//1. 2개의 정수를 매개변수로 받아서 곱한 결과 반환하는 메소드(익명메소드 이용)
		//FunctionalInter3 참고해서 새로운 함수형 인터페이스 FuncInter1 만들고 진행
		FuncInter1 fi = (num1, num2) -> num1 * num2;
		System.out.println(fi.method(1, 2));
		

		//2. 함수형인터페이스 FuncInter2 만들고 2개의 문자열을 매개변수로 전달받는
		// 	추상 메소드 선언
		//  람다식 이용하여 2개의 문자열을 연결하여 출력하기
		FuncInter2 fi2 = (s1, s2) ->  System.out.println(s1 + s2);
		fi2.method2("안녕", "하세요");
		
	}

}

















