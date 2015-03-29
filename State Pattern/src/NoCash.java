
public class NoCash implements ATMState{
	ATMMachine machine;
	public NoCash(ATMMachine machine){
		this.machine = machine;
	}
	@Override
	public void insertCard() {
		System.out.println("We don't have any money");
		
	}
	@Override
	public void rejectCard() {
		System.out.println("we don't have any money");
		
	}
	@Override
	public void enterPin(int number) {
		System.out.println("We don't have any money");
		
	}
	@Override
	public void requestCash(int cash) {
		System.out.println("There's no cash left man");
		
	}

}
