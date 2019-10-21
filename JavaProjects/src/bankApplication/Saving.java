package bankApplication;

public class Saving extends Account {
	
	private int safetyDepositBoxId;
	private int safetyDepositBoxKey;
	

	public Saving(String name,String sSN, double initDeposit) {
		super(name,sSN,initDeposit);
		accountNumber = "2" + accountNumber;
		setSafetyDepositBox();
		
	}
	
	private void setSafetyDepositBox() {
		safetyDepositBoxId = (int)(Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int)(Math.random() * Math.pow(10, 4));
		
	}
	
	public void showInfo() {
		System.out.println("ACCOUNT TYPE: Saving");
		super.showInfo();
		System.out.println(
				"Your Saving Accout Features" +
				"\n Safety Deposit Box ID: " + safetyDepositBoxId +
				"\n Safety Deposit Box Key: " + safetyDepositBoxKey
				);
		
		
		
	}

	@Override
	public void setRate() {
		rate = getBaseRate() - .25;
	}

}
