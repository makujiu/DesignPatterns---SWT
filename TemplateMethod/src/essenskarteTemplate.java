import java.util.*;

abstract class essenskarteTemplate {
	List<String> getranke = new ArrayList();
	List<String> essensListe = new ArrayList();
	
	public void setGetranke(String g){
		System.out.println("Getr�nk: " + g + " hinzugef�gt");
		getranke.add(g);		
	}
	
	abstract void setEssen(String s);
	}


