
class Account{
	private int id;
	private String name;
	private String branch;
	void deposit() {
		System.out.println("Balance deposit in your account");
	}
	void withdraw() {
		System.out.println("Withdraw from your account");
	}
	void checkBalance() {
		System.out.println("Check Account Balance");
	}
	void roi() {
		System.out.println("Rate of Interest of account");
	}
}

class SavingAccount extends Account{
	void roi() {
		System.out.println("Rate of Interest paid by bank 2%");
	}
	void limitedTransaction() {
		System.out.println("Limited Transaction");
	}
}
class CurrentAccount extends Account{
	void roi() {
		System.out.println("Balance paid by customer to bank");
	}
	void ODlimit() {
		System.out.println("ODlimit extend in current account");
	}
}
class FixedDeposit extends Account{
	void roi() {
		System.out.println("Rate of Interest increase during locking period");
	}
	void fixedDeposit() {
		System.out.println("locking Period");
	}
}
class Call{
	static void callme(Account account) {
		account.checkBalance();
		account.deposit();
		account.withdraw();
		account.roi();
		if (account instanceof SavingAccount) {
			((SavingAccount) account).limitedTransaction();
		}else if(account instanceof CurrentAccount) {
			((CurrentAccount) account).ODlimit();
		}else if(account instanceof FixedDeposit) {
			((FixedDeposit) account).fixedDeposit();
		}
		System.out.println("******************************************");
	}
}

public class ISA {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Call.callme(new SavingAccount());
		Call.callme(new CurrentAccount());
		Call.callme(new FixedDeposit());
//		SavingAccount savingAccount = new SavingAccount();
//		savingAccount.checkBalance();
//		savingAccount.deposit();
//		savingAccount.withdraw();
//		savingAccount.roi();
//		savingAccount.limitedTransaction();
//		System.out.println("***********************************************");
//		CurrentAccount currentAccount = new CurrentAccount();
//		currentAccount.checkBalance();
//		currentAccount.deposit();
//		currentAccount.withdraw();
//		currentAccount.roi();
//		currentAccount.ODlimit();
	}
}
