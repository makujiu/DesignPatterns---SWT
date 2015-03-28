
public class Klimaanlage extends Sonderausstattung{

	public Klimaanlage(Komponente k) {
		super(k);
		
	}

	@Override
	public String getBeschreibung() {
		
		return BASIS_KOMPONENTE.getBeschreibung() + " und Klimaanlage";
	}

	@Override
	public int getPreis() {
		
		return BASIS_KOMPONENTE.getPreis() + 150;
	}

}
