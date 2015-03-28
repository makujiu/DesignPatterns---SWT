
public class tvOnCommand implements Command{

	Device tv;
	public tvOnCommand(Device tv){
		this.tv = tv;
	}
	@Override
	public void execute() {
		tv.turnOn();
	}
	public void undo(){
		tv.turnOff();
	}
}
