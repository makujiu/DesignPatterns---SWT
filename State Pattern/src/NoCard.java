
public class NoCard implements ATMState{
	ATMMachine machine;
	public NoCard(ATMMachine machine){
		this.machine = machine;
	}
	@Override
	public void insertCard() {
		machine.state = machine.getHasCardState();
		System.out.println("Card entered");
	}
	@Override
	public void rejectCard() {
		System.out.println("There's no card");
		
	}
	@Override
	public void enterPin(int number) {
		System.out.println("Please insert the card first");
		
	}
	@Override
	public void requestCash(int cash) {
		System.out.println("Please insert the card first");
		
	}

}
