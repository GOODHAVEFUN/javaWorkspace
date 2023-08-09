package constructor;

public class Tv {
	//전원 켜기, 끄기
	//볼륨 up, down
	//채널 up, down
	
	//필드
	int ch;
	int vol;
	boolean power;
	String brand;
	String color;
	
	//생성자	
	public Tv(int ch, int vol, boolean power) {
		this.ch = ch;
		this.vol = vol;
		this.power = power;
	}
	
	//메소드
	void powerOn() {
		power = true;
		System.out.println("전원 켰습니다");
	}
	void powerOff() {
		power = false;
		System.out.println("전원 껐습니다");
	}
	
	void chUp(int ch) {
//		ch++;
		System.out.println("채널을 올립니다 현재 채널 : " + ch);
	}

	void chDown() {
		ch--;
		System.out.println("채널을 올립니다 현재 채널 : " + ch);
	}
	
}










