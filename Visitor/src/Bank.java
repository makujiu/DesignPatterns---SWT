
public class Bank {
	public static void main(String[] args){
		CurrencyCalc calc = new CurrencyCalc();
		Euro eur = new Euro(1000);
		Dollar dol = new Dollar(5315);
		
		eur.accept(calc);
		dol.accept(calc);
	}

}
