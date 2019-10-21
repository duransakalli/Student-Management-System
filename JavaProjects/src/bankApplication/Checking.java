package bankApplication;

public class Checking extends Account {

	private int debitCardNumber;
	private int debitCardPin;

	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		setDebitCard();
	}

	private void setDebitCard() {
		debitCardNumber = (int)(Math.random() * Math.pow(10, 12));
		debitCardPin = (int)(Math.random() * Math.pow(10, 4));
	}

	public void showInfo() {
		System.out.println("ACCOUNT TYPE: Checking");
		super.showInfo();
		System.out.println("Your Saving Accout Features" + 
				"\n Debit Card Number: " + debitCardNumber + 
				"\n Debit Card PIN Number: " + debitCardPin
				);
	}

	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		rate = getBaseRate() * .85;
	}
}
