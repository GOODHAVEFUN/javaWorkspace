package InterTest;

public interface Fan {
	//상수, 추상메소드
	void on();
	void off();
	void turbo();
	
	//인터페이스를 구현할 클래스 3개를 만든다
	//on(), off(), turbo() 를 구현한다
	
	//1. BasicFan
	//버튼으로 전원 켜기, 전원끄기를 출력한다
	//터보는 비워둔다
	
	//2. BasicFan2
	//리모컨으로 전원 켜기, 전원끄기를 출력한다
	//터보는 터보라고 출력한다
	
	//3. SmartFan
	//음성인식으로 전원 켜기, 끄기를 출력한다
	//터보는 터보라고 출력한다
	
	//4. Main 객체만 만들고 생성자로 바로 출력
	// 메소드
	
}














