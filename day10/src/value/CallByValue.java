package value;

public class CallByValue {
	public static void main(String[] args) {
		//값에 의한 호출
		//기본 자료형
		int a = 10;	//변수 a에 10을 대입
		int b = a;	//변수 b에 변수 a가 가진 값을 복사하고 대입
		b = 20;		//변수 b에 20을 대입
		
		System.out.println(a); //10
		System.out.println(b); //20

	}
}
