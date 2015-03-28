
public class Remote {
	public static void main(String[] args){
		Device TV = new TV();
		tvOnCommand onButton = new tvOnCommand(TV);
		tvOffCommand offButton = new tvOffCommand(TV);
		offButton.execute();
		onButton.execute();
		offButton.execute();
		onButton.execute();
		
	}

}
