package constructor;

public class TvTask {
	//필드
	//color, inch, price, power(true : on, false:off)
	//channel = 1
	String color;
	int inch;
	int price;
	boolean power;
	int channel = 1;

	
	//생성자
	//color, inch, price
	public TvTask(String color, int inch, int price) {
		super();
		this.color = color;
		this.inch = inch;
		this.price = price;
	}

	//color, inch, price, channel
	public TvTask(String color, int inch, int price, int channel) {
		super();
		this.color = color;
		this.inch = inch;
		this.price = price;
		this.channel = channel;
	}

	//메소드
	//powerOnOff() => true -> false, false -> true
	void powerOnOff() {
		power = !power;
	}
	
	//channelUp() => return channel +1  //증감연산자사용
	int channelUp() {
		return ++channel;
	}
	
	//channelDown() => return channel -1	//증감연산자사용
	int channelDown() {
		return --channel;
	}
	
	void info() {
		System.out.println("색상 : " + color + ", 인치 : " + inch
				+ ", 가격 : " + price);
	}
}















