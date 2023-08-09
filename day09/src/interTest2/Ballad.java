package interTest2;

public class Ballad implements Music{

	@Override
	public void mode() {
		System.out.println("Ballad 모드");
	}

	void onlyBallad() {
		System.out.println("onlyBallad 모드 실행");
	}
}
