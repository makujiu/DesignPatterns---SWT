
public class Jukebox {
	SongComponent songList;
	public Jukebox(SongComponent songlist){
		songList = songlist;
	}
	
	public void play()
	{
		System.out.println(songList.getDescription());
	}
}
