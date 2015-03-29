
public class CarFactory implements AbstractVehicleFactory{

	String marke;
	
	public Wheels createWheel()
	{
		return new Wheels();
	}
	
	public void createMarke(String mark){
		marke = mark;
		System.out.println("Oh it's a " + marke);
	}
	@Override
	public void setWheels(int amountOFWheels) {
		for(int i = 0; i < amountOFWheels; i++)
			new Wheels();
		System.out.println("created " + amountOFWheels + "wheels");
		
	}
	
	public Engine createEngine()
	{
	
		System.out.println("Created an engine for your brand new car!");
		return 	new Engine();
	}
	@Override
	public void setSize() {
		System.out.println("Your car is 2 meter big");
		
	}

	@Override
	public void setWeight() {
		System.out.println("It weights 1  tonne");
		
	}

}
