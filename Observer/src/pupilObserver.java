import java.util.List;


public class pupilObserver implements Observer{
	List<String> pupilList;
	static int id = 0;
	private int obsId = 0;
	classroom cr;

	public pupilObserver(classroom cr){
		id++;
		obsId = id;
		this.cr = cr;
		System.out.println("Observer : " + id + this.toString());
		System.out.println();
		register(this);
		pupilList = cr.getPupils();
	
		
	
	}
	@Override
	public void update() {
		System.out.println("Observer " + obsId + " has updated");
		pupilList = cr.getPupils();
		System.out.println();
		displayPupils();
		
	}
	public void displayPupils(){
		for(String a : pupilList){
			System.out.println(a);
		}
	}
	public void register(Observer o){
		cr.observerList.add(o);
	}
}
