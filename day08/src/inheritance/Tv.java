package inheritance;

public class Tv {
	//기본기능만 있는 Tv(ch, vol, power)
	//필드
	int ch;
	int vol;
	boolean power;
	
	//메소드
	void chUp() {
		System.out.println("채널을 올립니다");
	}
	void chDown() {
		System.out.println("채널을 내립니다");
	}
	void volUp() {
		System.out.println("볼륨을 올립니다");
	}
	void volDown() {
		System.out.println("볼륨을 내립니다");
	}
	void powerOnOff() {
		power = !power;
		System.out.println(power);
	}
}


















