
public class Navi extends Sonderausstattung{

	public Navi(Komponente k) {
		super(k);
		
	}

	@Override
	public String getBeschreibung() {
		
		return BASIS_KOMPONENTE.getBeschreibung() + " und Navi";
	}

	@Override
	public int getPreis() {
		
		return BASIS_KOMPONENTE.getPreis() + 3000;
	}

}
