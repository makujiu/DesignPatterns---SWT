
public class Euro implements Currency{
	
	private int amount;
	public Euro(int a){
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
