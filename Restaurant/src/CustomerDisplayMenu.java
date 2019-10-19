import java.util.Scanner;
public class CustomerDisplayMenu extends LogInDisplay {

	boolean exit;
	
	public void runCustomerDisplayMenu() {
		printHeader();
		while(!exit) {
			printCustomerDisplayMenu();
			int choice = getInput();
			performAction(choice);
		}
	}
		private int getInput() {
			Scanner kb = new Scanner(System.in);
			int choice = -1;
			while(choice < 0 || choice > 4) {
				try {
					System.out.print("\nEnter your choice: ");
					choice = Integer.parseInt(kb.nextLine());
				}
				catch(NumberFormatException e) {
					System.out.println("Invalid entry! Please try again.");
				}
			}
			return choice;
		}

		private void printHeader() {
			System.out.println("+--------------------------------------------------+");
			System.out.println("|           This is the Customer Display!          |");			
			System.out.println("+--------------------------------------------------+");
			
		}
		
		public void printCustomerDisplayMenu() {
			System.out.println("\nPlease make a selection\n");
			System.out.println("1) Press 1 for Order Choices");
			System.out.println("2) To Check Out!");

			System.out.println("0) Press 0 to go back to LOG IN!");
			
		}
		
		private void performAction(int choice) {
			CustomerOrder customerOrder = new CustomerOrder();
			switch(choice) {
				case 0: {
				exit = true;
				System.out.println("Thank You, Good bye!");
				break;
				}

				case 1: {
					System.out.println("+--------------------------------------------------+");
					System.out.println("|           Customer Order Choices      !          |");			
					System.out.println("+--------------------------------------------------+");

		
				// creating new initial breakfast and lunch menus
				
				BreakfastMenu breakfastMenu = new BreakfastMenu();
				LunchMenu lunchMenu = new LunchMenu();

				// creating new customer object
				Customer customer = new Customer(breakfastMenu, lunchMenu);
				customer.printMenu();
			
				break;
				}
				
				case 2: {			
				System.out.println("How much would you like to pay?");	
				
				
				break;
				}

				default: {
				System.out.println("Unknown entry! Try Again!");
				break;
				}				
			}		
		
		}	
		
}
