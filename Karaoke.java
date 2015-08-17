package Karaoke;

public class Karaoke {
	
	public static void main(String arg[]){
		
		//Song song = new Song("Jurney","Dont Stop Believe it  ","https://www.youtube.com/watch?v=PBEXSiFzOfU");
		
		SongBook songBook = new SongBook();
		KaraokeMachine machine = new KaraokeMachine(songBook);
		machine.run();
		
		//System.out.printf("Adding %s %n", song);
		//songBook.addSong(song);
		//System.out.println("There are " + songBook.getSongCount() + " Songs");
	}

}
