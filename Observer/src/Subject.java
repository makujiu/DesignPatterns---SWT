
public interface Subject {
	public void register(Observer o);
	public void notifyObserver();
	public void unregister(Observer o);

}
