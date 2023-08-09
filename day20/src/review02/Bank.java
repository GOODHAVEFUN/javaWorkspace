package review02;

import java.util.ArrayList;
import java.util.List;

//은행클래스
public class Bank {
	//필드
	List<Account> accounts; //계좌 리스트 저장할 변수

	//생성자
	public Bank() {
		super();
		accounts = new ArrayList<Account>();
	}
	
	//계좌 개설 기능 메소드
	public void addAccount(String num, String owner, int balance) {
		accounts.add(new Account(num, owner, balance));
	}
	
//	//출금 실행 메소드 
//	public void runWithdraw(int amount) {
//		System.out.println("실행 쓰레드 : " + Thread.currentThread().getName());
//		
//		for(Account ac : accounts) {
//			Runnable task = new WithdrawTask(ac, amount);
//			task.run();
//		}	
//	}
	
	//여러계좌의 출금 작업 동시 진행
	public void runWithdraw(int amount) {
		List<Thread> thread = new ArrayList<Thread>();
		for(Account ac : accounts) {
			Thread th = new Thread(new WithdrawTask(ac, amount));
			th.start();
			thread.add(th);
		}
		
		for(Thread th : thread) {
			System.out.println(th);
			try {
				th.join(); //각 쓰레드가 종료될때까지 기다림
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
	//출금 작업 클래스
	class WithdrawTask implements Runnable{
		//필드
		Account account;//계좌 객체
		int amount;//출금액
		
		//생성자
		public WithdrawTask(Account account, int amount) {
			super();
			this.account = account;
			this.amount = amount;
		}
		
		//메소드
		@Override
		public void run() {
			if(account.withraw(amount)) {
				System.out.println(account.num + "출금성공");
			}else {
				System.out.println(account.num + "출금실패, 잔액부족");
			}
		}	
	}














