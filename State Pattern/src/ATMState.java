
public interface ATMState {
	void insertCard();
	void rejectCard();
	void enterPin(int number);
	void requestCash(int cash);

}
