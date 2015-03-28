
public class TV implements Device{

	boolean tvOn = false;
	@Override
	public void turnOn() {
		if(tvOn)
			System.out.println("TV is already on");
		else{
		tvOn = true;
		System.out.println("TV is on.");
		}
		
	}

	@Override
	public void turnOff() {
		if(!tvOn)
			System.out.println("TV is already off");
		else{
			tvOn = false;
			System.out.println("TV is off");
		}
				
	}

}
