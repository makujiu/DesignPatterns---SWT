
public class vegetarischeSpeisekarte extends essenskarteTemplate{

	@Override
	void setEssen(String s) {
		System.out.println("Vegetarische Speise: " + s + " zur Speisekarte hinzugef�gt");
		essensListe.add(s);
		
	}

}
