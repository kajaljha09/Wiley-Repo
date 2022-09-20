
public class BankApp {

	public static void main(String args[]) {
		AccountType a1=AccountType.SAVINGS;
		AccountType a2=AccountType.CURRENT;
		BankAccount b1=new BankAccount(100,"Kajal",a1);
		BankAccount b2=new BankAccount(101,"Priyanka",a2);
		try {
			System.out.println("The interest calculated is-->"+b1.calculateTotalInterest(-500, 8));
		} catch (DepositAmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println("The interest calculated is-->"+b2.calculateTotalInterest(500, 8));
		} catch (DepositAmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
