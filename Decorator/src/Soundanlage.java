
public class Soundanlage extends Sonderausstattung{

	public Soundanlage(Komponente k) {
		super(k);
	}

	@Override
	public String getBeschreibung() {
		return BASIS_KOMPONENTE.getBeschreibung() + " und Soundanlage";
	}

	@Override
	public int getPreis() {
		
		return BASIS_KOMPONENTE.getPreis() + 200;
	}

}
