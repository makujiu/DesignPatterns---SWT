
public class HasPin implements ATMState{
	ATMMachine machine;
	
	public HasPin(ATMMachine machine){
		this.machine = machine;
	}

	@Override
	public void insertCard() {
		System.out.println("You have already entered the card and pin, dude!");
		
	}

	@Override
	public void rejectCard() {
		System.out.println("Thank you and good bye");
		
	}

	@Override
	public void enterPin(int number) {
		System.out.println("Pin already entered");
		
	}

	@Override
	public void requestCash(int cash) {
		if (cash >= machine.getATMMoney()){
			machine.state = machine.getNoCardState();
			System.out.println("No cash in ATM");
		} else{
			System.out.println("Withdrawed " + cash + "€.");
			machine.withdrawMoney(cash);
		}
		
	}

}
