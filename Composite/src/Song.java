
public class Song extends SongComponent{
	private String title;
	
	public Song(String t){
		setDescription(t);
	}
	
	
	public String getTitle(){
		return title;
	}
	@Override
	void addSong(SongComponent a) {}

	@Override
	void removeSong(String t) {}
	

}
