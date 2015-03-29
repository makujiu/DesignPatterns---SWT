
public class vegetarischeSpeisekarte extends essenskarteTemplate{

	@Override
	void setEssen(String s) {
		System.out.println("Vegetarische Speise: " + s + " zur Speisekarte hinzugefügt");
		essensListe.add(s);
		
	}

}
