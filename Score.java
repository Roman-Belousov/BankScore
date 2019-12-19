package BankAccount;

public class Score {

	public int AccountNumber;
	public int AccountBalance;
	public int NewAccountBalance;
	public boolean PositiveBalance;
	public boolean NegativeBalance;

	public int debit(int d) {
		if (AccountBalance >= d) {
			PositiveBalance = true;
			NewAccountBalance = AccountBalance - d;
		} else {
			NegativeBalance = true;
			System.out.println("Недостаточно средств");
		}
		return NewAccountBalance;
	}

	public int credit(int c) {
		NewAccountBalance = AccountBalance + c;

		return NewAccountBalance;
	}
}
