import java.util.*;


public class classroom implements Subject{
	
	List<Observer> observerList = new ArrayList();
	private List<String> pupilList = new ArrayList();
	
	public void addPupil(String name){
		pupilList.add(name);
	}
	public List<String> getPupils(){
		return pupilList;
	}
	@Override
	public void register(Observer o) {
		observerList.add(o);
		
	}

	@Override
	public void notifyObserver() {
		for(Observer a : observerList)
			a.update();
		
	}
	
	@Override
	public void unregister(Observer o) {
		observerList.remove(o);
		
	}

}
