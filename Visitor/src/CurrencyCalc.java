
public class CurrencyCalc implements Visitor{

	@Override
	public void visit(Dollar d) {
		float euro = (float) (d.getAmount() * 0.98);
		System.out.println(d.getAmount() + " $ equals to " + euro + " €");
		
	}

	@Override
	public void visit(Euro e) {
		float dollar = (float) (e.getAmount() * 1.2);
		System.out.println(e.getAmount() + "€ equals to " + dollar + " $");
		// TODO Auto-generated method stub
		
	}
	
	

}
