
public class LightsOnCommand implements Command {
	
	Lights lights;
	
	public LightsOnCommand(Lights lights) {
		this.lights = lights;
	}
	
	public void execute() {
		lights.on();		
	}

}