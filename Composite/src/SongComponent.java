
public abstract class SongComponent {
	private String description;
	
	abstract void addSong(SongComponent a);
	abstract void removeSong(String t);
	
	public void setDescription(String s){
		description = s;
	}
	
	public String getDescription(){
		return description;
	}
	


}
