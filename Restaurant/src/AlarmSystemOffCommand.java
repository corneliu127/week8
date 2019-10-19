
public class AlarmSystemOffCommand implements Command {
	
	AlarmSystem alarmSystem;
	
	public AlarmSystemOffCommand(AlarmSystem alarmSystem) {
		this.alarmSystem = alarmSystem;
	}
	
	public void execute() {
		alarmSystem.off();	
	}

}