
public class Bank {

	public static void main(String[] args){
		ATMMachine machine= new ATMMachine(350);
		machine.insertCard();
		machine.enterPin(1234);
		machine.rejectCard();

	}
}
