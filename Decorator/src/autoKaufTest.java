
public class autoKaufTest {

	public static void main(String[] args) {
		Komponente grundmodell = new model_A();
		Komponente navi = new Navi(grundmodell);
		Komponente klima = new Klimaanlage(navi);
		Komponente sound = new Soundanlage(klima);
		
		System.out.println(sound.getBeschreibung());
		System.out.println("Preis: \t"  + sound.getPreis());
		

	}

}
