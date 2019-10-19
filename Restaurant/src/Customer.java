
public class Customer {

	// creating breakfast and lunch menus and the order list
	BreakfastMenu breakfastMenu;
	LunchMenu lunchMenu;
	CustomerOrder customerOrder;
	

	public Customer(BreakfastMenu breakfastMenu, LunchMenu lunchMenu) {
		this.breakfastMenu = breakfastMenu;
		this.lunchMenu = lunchMenu;
		
	}
	

	public Customer(CustomerOrder customerOrder) {
		this.customerOrder = customerOrder;
	}


	public void printMenu() {
		// creating the two iterators one from each menu
		Iterator breakfastIterator = breakfastMenu.createIterator();		
		Iterator lunchIterator = lunchMenu.createIterator();
		
		System.out.println("Breakfast Menu\n");
		printMenu(breakfastIterator);
		System.out.println("Lunch Menu\n");
		printMenu(lunchIterator);
	}
	
		
	private void printMenu(Iterator iterator) {
		int num = 0;
		while (iterator.hasNext()) {
			num++;
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(num + ") ");
			System.out.print(" $" + menuItem.getPrice() + "\t");
			System.out.println("-- " + menuItem.getName() + " ");			
			System.out.println("\t"+ menuItem.getDescription());
			System.out.println("\tOrder Code: " +menuItem.getOrderCode() +"\n ");
		}
		
	}

	public void printBreakfastMenu() {
		Iterator breakfastIterator = breakfastMenu.createIterator();
		System.out.println("Breakfast Menu\n");
		printMenu(breakfastIterator);
	}
	

	public void printLunchMenu() {
		Iterator lunchIterator = lunchMenu.createIterator();
		System.out.println("Lunch Menu\n");
		printMenu(lunchIterator);
		
	}
	
	public void printCustomerOrder() {
		Iterator customerOrderIterator = customerOrder.createIterator();
		System.out.println("Customer Order\n");
		printMenu(customerOrderIterator);
		
	}

					
}