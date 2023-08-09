package interTest2;

public class Rock implements Music{

	@Override
	public void mode() {
		System.out.println("Rock 모드 실행");
	}

	//일반메소드 가능
	void onlyRock() {
		System.out.println("onlyRock 실행");
	}
}
