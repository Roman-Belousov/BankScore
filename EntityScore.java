package BankAccount;

public class EntityScore extends Score {

	private int taxpayerIN;

	@Override
	public int debit(int d) {
		if (d > 500) {
			NewAccountBalance = (int) (AccountBalance - d - (d * 0.005));
		}
		return NewAccountBalance;

	}

	@Override
	public int credit(int c) {
		if (taxpayerIN % 10000 != 0) {
			NewAccountBalance = (int) ((AccountBalance + c) - (c * 0.05));
		} else {
			NewAccountBalance = (int) ((AccountBalance) + c - (c * 0.2));
		}
		return NewAccountBalance;
	}

}
