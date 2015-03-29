import javax.swing.JOptionPane;


public class HasCard implements ATMState{
	
	ATMMachine machine;
	
	public HasCard(ATMMachine machine){
		this.machine = machine;
	}

	@Override
	public void insertCard() {
		System.out.println("Card already entered");
		
	}

	@Override
	public void rejectCard() {
		machine.state = machine.getNoCardState();
		System.out.println("Card rejected");
	}

	@Override
	public void enterPin(int number) {
		if(number == 1234){
			machine.state = machine.getHasPinState();
			System.out.println("Correct Pin entered, please enter the amount of cash");
			JOptionPane input = new JOptionPane();
			int cash = Integer.parseInt(input.showInputDialog("Please enter the amount of cash"));
			machine.requestCash(cash);

		}
		else
			System.out.println("Wrong number");
		
	}

	@Override
	public void requestCash(int cash) {
		System.out.println("Please enter the pin first");
		
	}

}
