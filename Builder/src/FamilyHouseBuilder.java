
public class FamilyHouseBuilder implements HouseBuilder{

	@Override
	public void buildRoof() {
		System.out.println("Set a big nice roof");
		
	}

	@Override
	public void setWindows() {
		System.out.println("Set beautiful windows!");
		
	}

	@Override
	public void setWallMaterial() {
		System.out.println("Set nice wooden walls!");
		
	}

	@Override
	public void setDoor() {
		System.out.println("Set an awesome door!");
		
	}

	@Override
	public void paintHouse() {
		System.out.println("Painted the house");
		
	}
	
	public void createHouse(){
		setWallMaterial();
		buildRoof();
		setWindows();
		setDoor();
		paintHouse();
		System.out.println("\n \n Your family house is done! Have fun buddy");
		
	}

}
