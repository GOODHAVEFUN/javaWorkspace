package review02;

//은행계좌 클래스
public class Account {
	//필드
	String num; //계좌번호 저장하는 변수
	String owner; //계좌소유자 저장하는 변수
	int balance; //현재 잔고 저장하는 변수
	
	//생성자
	public Account(String num, String owner, int balance) {
		super();
		this.num = num;
		this.owner = owner;
		this.balance = balance;
	}
	
	//메소드
	//입금 기능 메소드
	public void deposit(int amount) {
		balance += amount;
	}
	
	//출금 기능 메소드
	public boolean withraw(int amount) {
		if(balance >= amount) {
			balance -= amount;
			return true;
		}else {
			return false;
		}
	}
}
















