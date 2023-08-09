package review02;

public class BankMain {
	public static void main(String[] args) {
	Bank bank = new Bank();
	bank.addAccount("계좌1", "짱구", 150000);
	bank.addAccount("계좌2", "철수", 250000);
	
	System.out.println(bank);
	bank.runWithdraw(100000);
	
	for(Account ac : bank.accounts) {
		System.out.println(ac.num + " : " + ac.owner + "님의 잔액 : " + ac.balance);
	}
	
	}
}
