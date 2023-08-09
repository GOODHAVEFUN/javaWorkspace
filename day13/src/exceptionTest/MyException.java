package exceptionTest;
//java.lang 패키지는 import 받지 않아도 됨
public class MyException extends Exception{
	//생성자
	public MyException() {
		super("음수 입력하면 안돼요");
	}
}

