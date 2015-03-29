
public class CarSchmiede {
	
	public static void main(String[] args)
	{
		CarFactory smith = new CarFactory();
		//Let's make our car now!
		smith.createMarke("BMW");
		smith.createEngine();
		smith.setWheels(4);
		//Implying our Smith knows how big and heavy a PKW has to be
		smith.setSize();
		smith.setWeight();
		
		//With the Factory you can also create new Objects
		Wheels extraWheel = smith.createWheel();
		Engine extraEngine = smith.createEngine();
		
		
	}

}
