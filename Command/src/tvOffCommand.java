
public class tvOffCommand implements Command{

	Device tv;
	public tvOffCommand(Device tv){
		this.tv = tv;
	}
	@Override
	public void execute() {
		tv.turnOff();
	}
	public void undo(){
		tv.turnOn();
	}
}
