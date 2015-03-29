
abstract class Animal {
	int height;
	int weight;
	String name;
	String food;
	IFliegen flugtyp;
	
	public void setHeight(){
		// blabla 
	}
	public void setWeight(){
		//blabla
	}
	public void setName(){
		//blabla
	}
	public void setFlugtyp(IFliegen flugtyp){
		this.flugtyp = flugtyp;
	}
		
	public void fliegen(){
		System.out.println(flugtyp.fliegen());
	}
	}

