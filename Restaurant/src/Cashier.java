
public class Cashier {
		 

	State noMoneyState;
	State hasMoneyState;
	State soldState;
	State notEnoughState;
	
	State state = notEnoughState;
	double totalCost = 0;
	 
	public Cashier(double total, double moneyIn) {

		noMoneyState = new NoMoneyState(this);
		hasMoneyState = new HasMoneyState(this);
		soldState = new SoldState(this);

		this.totalCost = total;
	 	if (totalCost < moneyIn) {
			state = notEnoughState;
		} 
	}
	 
	public void insertMoney() {
		state.insertMoney();
	}
 
	public void ejectMoney() {
		state.ejectMoney();
	}
 
	public void checkOut() {
		state.checkOut();		
	}

	void setState(State state) {
	this.state = state;
	}
	 
    public State getState() {
        return state;
    }


    public State getNoMoneyState() {
        return noMoneyState;
    }

    public State getHasMoneyState() {
        return hasMoneyState;
    }

}
	
