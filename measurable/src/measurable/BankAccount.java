package measurable;

public class BankAccount implements Measurable {

	private int accountNumber;
	private int balance;

	public static int accountNumberGenerator = 0;

	public BankAccount() {

		this(0);

	}

	public BankAccount(int balance) {

		this.balance = balance;
		accountNumber = ++accountNumberGenerator;
	}

	public void deposit(int amount) {

		balance += amount;

	}

	public boolean withdraw(int amount) {

		if (amount > balance) {
			return false;
		} else {
			balance -= amount;
			return true;
		}

	}

	public boolean transfer(int amount, BankAccount other) {

		if (amount > balance) {
			return false;
		} else {
			this.balance -= amount;
			other.balance += amount;
			return true;
		}
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public double getMeasure() {
		return balance;
	}
}