import java.util.Scanner;
public class LogInDisplay {

	boolean exit;
	
	public void runLogInDisplay() {
		printHeader();
		while(!exit) {
			printLogInDisplay();
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
		System.out.println("|           Welcome to the Log In Menu!            |");
		System.out.println("|            The Restaurant Management             |");
		System.out.println("+--------------------------------------------------+");
		
	}
	
	public void printLogInDisplay() {
		System.out.println("\nPlease make a selection\n");
		System.out.println("1) Press 1 to Log In as Employye");
		System.out.println("2) Press 2 to Log In as Customer");
		System.out.println("3) Press 0 to Exit App");
		
	}
	
	private void performAction(int choice) {
		
		switch(choice) {
			case 0: {
			exit = true;
			System.out.println("Thank You, Good bye!");
			break;
			}

			case 1: {
			System.out.println("Log in as an employee!");
			EmployeeDisplayMenu employeeDisplayMenu = new EmployeeDisplayMenu();
			employeeDisplayMenu.runEmployeeDisplayMenu();
			break;
			}
			
			case 2: {			
			System.out.println("Log in as a customer!");
			CustomerOrder customerOrder = new CustomerOrder();
			CustomerDisplayMenu customerDisplayMenu = new CustomerDisplayMenu();
			customerDisplayMenu.runCustomerDisplayMenu();
			
			break;
			}

			default: {
			System.out.println("Unknown entry! Try Again!");
			break;
			}				
		}		
	}
}
