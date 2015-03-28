
public class CarSchmiede {
	
	public static void main(String[] args)
	{
		CarFactory smith = new CarFactory();
		smith.createMarke("BMW");
		smith.createEngine();
		smith.setWheels(8);
		smith.setSize();
		smith.setWeight();
		
		Wheels extraWheel = smith.createWheel();
		Engine extraEngine = smith.createEngine();
		
		
	}

}
