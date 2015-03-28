
public class Bar {
	
	public static void main(String[] args){
		SongComponent hiphop = new SongGroup();
		hiphop.addSong(new Song("Me Against the World"));
		hiphop.addSong(new Song("changes"));
		hiphop.addSong(new Song("Thugz Mansion"));
		
		SongComponent rock = new SongGroup();
		rock.addSong(new Song("Tuesdays gone"));
		rock.addSong(new Song("Nothing else matters"));
		rock.addSong(new Song("Bushido"));
		
		SongComponent playlist = new SongGroup();
		playlist.addSong(hiphop);
		playlist.addSong(rock);
		
		SongComponent dance = new SongGroup();
		dance.addSong(new Song("Flash dance"));
		dance.addSong(new Song("You're the one I want"));
		dance.addSong(new Song("saturday nightfever"));
		
		SongComponent disney = new SongGroup();
		disney.addSong(new Song("Can you feel"));
		disney.addSong(new Song("Aladin"));
		disney.addSong(new Song("mulan"));
		
		SongComponent playlist2 = new SongGroup();
		playlist2.addSong(dance);
		playlist2.addSong(disney);
		
		playlist.addSong(playlist2);
		
		Jukebox box = new Jukebox(playlist);
		box.play();
		
		System.out.println("\t" + disney.getDescription());
		
	}
	

}
