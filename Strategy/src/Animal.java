
abstract class Animal {
	int height;
	int weight;
	String name;
	String food;
	IFliegen flugtyp;
	
	public void setHeight(){}
	public void setWeight(){}
	public void setName(){}
	public void setFlugtyp(IFliegen flugtyp){
		this.flugtyp = flugtyp;
	}
		
	public void fliegen(){
		System.out.println(flugtyp.fliegen());
	}
	}

