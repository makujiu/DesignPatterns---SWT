import java.util.*;

abstract class essenskarteTemplate {
	List<String> getranke = new ArrayList();
	List<String> essensListe = new ArrayList();
	
	public void setGetranke(String g){
		System.out.println("Getränk: " + g + " hinzugefügt");
		getranke.add(g);		
	}
	
	abstract void setEssen(String s);
	}


