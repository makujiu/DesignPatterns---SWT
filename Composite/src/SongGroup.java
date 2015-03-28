import java.util.*;


public class SongGroup extends SongComponent{

	List<SongComponent> Songs = new ArrayList();
	@Override
	void addSong(SongComponent a) {
		Songs.add(a);
		//System.out.println("Added \t" + a.getDescription());
	}

	@Override
	void removeSong(String t) {	
		for(int i = 0; i < Songs.size()-1; i++)
		{
			if(Songs.get(i).getDescription() == t){
				Songs.remove(i);
				System.out.println("Removed \t" + t);	
			}				
			else {
				System.out.printf("%d ", i);
			}
		}
		
	}
	
	@Override
	public String getDescription(){
		String result = "";
		for(SongComponent title : Songs)
			result = result + "\n" + title.getDescription();
		return result;
	}

}
