package constructor;

public class TvMain {
	public static void main(String[] args) {
		Tv sam = new Tv(22, 10, true);
		System.out.println(sam.ch);
		System.out.println(sam.power); //boolean 기본값 false
		System.out.println("현재 채널 : " + sam.ch + "\n현재 볼륨 : "
				+ sam.vol +  "\n전원onoff여부 : " + sam.power);
		
		sam.powerOn();
		System.out.println(sam.power); //boolean 기본값 false
		sam.chUp(13);
//		sam.chUp();
//		sam.chUp();
		
	}
}
