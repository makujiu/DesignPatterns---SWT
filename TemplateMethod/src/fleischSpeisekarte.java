
public class fleischSpeisekarte extends essenskarteTemplate{

	@Override
	void setEssen(String s) {
		System.out.println("Fleischspeise: " + s + " hinzugef�gt");
		essensListe.add(s);
		
	}

}
