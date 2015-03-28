
public class test {
	public static void main(String[] args){
		classroom g = new classroom();
		Observer observA = new pupilObserver(g);
		Observer observB = new pupilObserver(g);
		
		g.addPupil("Julia");
		g.addPupil("Martin");
		g.notifyObserver();
		g.addPupil("Haris");
		g.addPupil("Kevin");
		g.addPupil("Simon");
		g.notifyObserver();
		
	}

}
