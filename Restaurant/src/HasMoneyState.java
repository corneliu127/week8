
public class HasMoneyState implements State {

	Cashier cashier;
	
    public HasMoneyState(Cashier cashier) {
        this.cashier = cashier;
    }
	
	public void insertMoney() {
		System.out.println("You already added money.");
		
	}


	public void ejectMoney() {
		System.out.println("Your money are being returned.");
		cashier.setState(cashier.noMoneyState);
	}


	public void checkOut() {
		System.out.println("Your Order is being processed!");
		cashier.setState(cashier.soldState);
	}
	
	public String toString() {
		return "Please Check Out!";
	}

}
