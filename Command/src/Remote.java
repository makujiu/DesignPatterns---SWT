
public class Remote {
	public static void main(String[] args){
		Device TV = new TV();
		tvOnCommand onButton = new tvOnCommand(TV);
		tvOffCommand offButton = new tvOffCommand(TV);
		onButton.execute();
		onButton.execute();
		
	}

}
