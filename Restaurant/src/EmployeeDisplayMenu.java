import java.util.Scanner;
public class EmployeeDisplayMenu extends LogInDisplay {

	boolean exit;
	boolean lightIsOn;
	boolean alarmIsArmed;
	
	public void runEmployeeDisplayMenu() {
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
			System.out.println("|           This is the Employee Display!          |");			
			System.out.println("+--------------------------------------------------+");
			
		}
		
		public void printCustomerDisplayMenu() {
			System.out.println("\nPlease make a selection\n");
			System.out.println("1) Press 1 to Check Alarm System.");
			System.out.println("1) Press 2 for Arming the Allarm System.");
			System.out.println("2) Press 3 for Disarming the Alarm System.");
			System.out.println("3) Press 4 Turning On the Lights.");
			System.out.println("4) Press 5 Turning Off the Lights.");

			System.out.println("0) Press 0 to go back to LOG IN!");
			
		}
		
		private void performAction(int choice) {
			
			switch(choice) {
				case 0: {
				exit = true;
				System.out.println("Thank You, Good bye!");
				break;
				}

				case 1: { // arming the alarm system
					
					if(alarmIsArmed) {
						System.out.println("+--------------------------------------------------+");
						System.out.println("|              The Alarm is ARMED !                |");			
						System.out.println("+--------------------------------------------------+");
						
					} else {
						System.out.println("+--------------------------------------------------+");
						System.out.println("|              The Alarm is OFF !                  |");			
						System.out.println("+--------------------------------------------------+");
					}
					
				
				break;
				}
				
				case 2: { // arming the alarm system
					
					ControlPanel control = new ControlPanel();
					AlarmSystem alarmSystem = new AlarmSystem();
					AlarmSystemOnCommand alarmOn = new AlarmSystemOnCommand(alarmSystem);
					alarmIsArmed = true;
					control.setCommand(alarmOn);
					control.buttonWasPressed();							
				
				break;
				}
				
				case 3: {	// disarming the alarm system
					
					ControlPanel control = new ControlPanel();
					AlarmSystem alarmSystem = new AlarmSystem();
					AlarmSystemOffCommand alarmOff = new AlarmSystemOffCommand(alarmSystem);
					alarmIsArmed = false;
					control.setCommand(alarmOff);
					control.buttonWasPressed();					
					
				break;
				}
				case 4: {			
					ControlPanel control = new ControlPanel();
					Lights lights = new Lights();
					LightsOnCommand lightsOn = new LightsOnCommand(lights);
					lightIsOn = true;
					control.setCommand(lightsOn);
					control.buttonWasPressed();
				
				break;
				}
				
				case 5: {
					ControlPanel control = new ControlPanel();
					Lights lights = new Lights();
					LightsOffCommand lightsOff = new LightsOffCommand(lights);
					lightIsOn = false;
					control.setCommand(lightsOff);
					control.buttonWasPressed();
					
				break;				
				}
				
				default: {
				System.out.println("Unknown entry! Try Again!");
				break;
				}				
			}		
		
		}	
		
}
