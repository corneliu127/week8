
public class AppTest {

	public static void main(String[] args) {
		
		LogInDisplay newLogIn = new LogInDisplay();
		newLogIn.runLogInDisplay();
		
// creating new initial breakfast and lunch menus
		
		BreakfastMenu breakfastMenu = new BreakfastMenu();
		LunchMenu lunchMenu = new LunchMenu();
// create a customer order list
		CustomerOrder customerOrder = new CustomerOrder();

// creating new customer object
		Customer customer = new Customer(breakfastMenu, lunchMenu);


				
// display both Breakfast and Lunch Menu
		customer.printMenu();
		
// display Breakfast Menu Only
		customer.printBreakfastMenu();
		
// display Lunch Menu Only
		customer.printLunchMenu();
		
		customerOrder.getMenuItems();
		
		
// display Lunch Menu Only
		customer.printLunchMenu();

// printing and adding to customer order
		
		
		System.out.println("Printing customer Order....");
		Customer order = new Customer(customerOrder);
		
		order.printCustomerOrder();
		
	}

}
