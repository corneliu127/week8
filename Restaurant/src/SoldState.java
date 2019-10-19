
public class SoldState implements State {

	Cashier cashier;
	
    public SoldState(Cashier cashier) {
        this.cashier = cashier;
    }
	
	public void insertMoney() {
		System.out.println("You inserted money.");
		cashier.setState(cashier.hasMoneyState);		
	}


	public void ejectMoney() {
		System.out.println("Here is your Change!");

	}


	public void checkOut() {
		System.out.println("Need to make a new order first!");
	}
	
	public String toString() {
		return "Your Order is Ready!";
	}

}
