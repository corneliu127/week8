
public class LightsOffCommand implements Command {
	
	Lights lights;
	
	public LightsOffCommand(Lights lights) {
		this.lights = lights;
	}
	
	public void execute() {
		lights.off();		
	}

}