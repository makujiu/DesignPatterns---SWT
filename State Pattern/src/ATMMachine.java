
public class ATMMachine{
	
	ATMState state;
	ATMState hasCard;
	ATMState noCard;
	ATMState hasPin;
	ATMState noCash;
	private int amountOfMoney;
	public ATMMachine(int money){
		hasCard = new HasCard(this);
		noCard = new NoCard(this);
		hasPin = new HasPin(this);
		noCash = new NoCash(this);
		amountOfMoney = money;
		state = noCard;
	}
	
	public ATMState getHasCardState(){
		return hasCard;
	}
	public ATMState getNoCardState(){
		return noCard;
	}
	public ATMState getHasPinState(){
		return hasPin;
	}
	public ATMState getNoCashState(){
		return noCash;
	}
	public int getATMMoney(){
		return amountOfMoney;
	}
	public void withdrawMoney(int cash){
		amountOfMoney -= cash;
	}

	
	public void insertCard() {
		state.insertCard();	
	}


	public void rejectCard() {
		state.rejectCard();
		
	}

	
	public void enterPin(int number) {
		state.enterPin(number);
		
	}

	
	public void requestCash(int cash) {
		state.requestCash(cash);
		
	}

}
