
public class NoMoneyState implements State {

	Cashier cashier;
	
    public NoMoneyState(Cashier cashier) {
        this.cashier = cashier;
    }
	
	public void insertMoney() {
		System.out.println("You inserted money.");
		cashier.setState(cashier.hasMoneyState);		
	}


	public void ejectMoney() {
		System.out.println("There is No Money In.");

	}


	public void checkOut() {
		System.out.println("You Must Pay First!");
	}
	
	public String toString() {
		return "Insert Money!";
	}

}
