
public class Restaurant {
	public static void main(String[] args)
	{
		fleischSpeisekarte fSpk = new fleischSpeisekarte();
		vegetarischeSpeisekarte vSpk = new vegetarischeSpeisekarte();
		fSpk.setEssen("Gyros");
		fSpk.setEssen("köfte");
		fSpk.setEssen("Klops");
		
		vSpk.setEssen("Tofu");
		vSpk.setEssen("Linsensupper");
		vSpk.setEssen("Spinat");
	}

}
