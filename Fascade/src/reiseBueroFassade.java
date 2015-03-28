
public class reiseBueroFassade {
	
	public reiseBueroFassade(int hotelSterne, boolean mietwagen, int anzahlPersonen)
	{
		hotelSterne(hotelSterne);
		mietwagen(mietwagen);
		anzahlPersonen(anzahlPersonen);
		Flug flight = new Flug((int) Math.random());
	}
	
	void hotelSterne(int Sterne)
	{
		System.out.println(Sterne + "Sterne Hotel Gebucht");
	}
	
	void mietwagen(boolean w)
	{
		if(w)
			System.out.println("Mietwagen dazu gebucht");
		else
			System.out.println("Kein Mietwagen");
	}
	
	void anzahlPersonen(int a)
	{
		System.out.println("Gebucht für " + a + " Personen");
	}
	

}
