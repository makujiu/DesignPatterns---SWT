
public class fleischSpeisekarte extends essenskarteTemplate{

	@Override
	void setEssen(String s) {
		System.out.println("Fleischspeise: " + s + " hinzugefügt");
		essensListe.add(s);
		
	}

}
