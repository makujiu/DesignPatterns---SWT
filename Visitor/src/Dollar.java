
public class Dollar implements Currency{

	private int amount;
	public Dollar(int a){
		amount = a;
	}
	public int getAmount(){
		return amount;
	}
	@Override
	public void accept(Visitor v) {
		v.visit(this);
		
	}

}
