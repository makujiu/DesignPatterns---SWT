
public interface IFliegen {
	public String fliegen();
}
	
	
	class Flugtier implements IFliegen{
		
		public String fliegen(){
			return "Ich kann fliegen!";
		}
	}
	
	class Bodentier implements IFliegen{
		public String fliegen(){
			return "ich kann nicht fliegen!";
		}
	}


