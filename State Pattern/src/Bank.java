
public class Bank {

	public static void main(String[] args){
		ATMMachine machine= new ATMMachine(350);
		machine.insertCard();
		machine.enterPin(1234);
		machine.rejectCard();
		//you can only navigate through the ATMMachine if the states are correct,e.g.
		// you can't pick up money if there's no pin entered and no card inserted
	}
}
