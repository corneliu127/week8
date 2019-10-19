
public class AlarmSystemOnCommand implements Command {
	
	AlarmSystem alarmSystem;
	
	public AlarmSystemOnCommand(AlarmSystem alarmSystem) {
		this.alarmSystem = alarmSystem;
	}
	
	public void execute() {
		alarmSystem.on();		
	}

}
