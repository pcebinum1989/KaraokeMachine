package Karaoke;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SongBook {
	
	private ArrayList<Song> mSongs;
	
	public SongBook(){
		mSongs = new ArrayList<Song>();
	}
	
	public void addSong(Song song){
		mSongs.add(song);
	}
	
	public int getSongCount(){
		return mSongs.size();
	}
	
	
	private Map<String, ArrayList<Song>> byArtist(){
		Map<String, ArrayList<Song>> byArtist = new HashMap<>();
		for(Song song : mSongs){
			ArrayList<Song> artistSongs = byArtist.get(song.getArtist());
			if(artistSongs == null){
				artistSongs = new ArrayList<>();
				byArtist.put(song.getArtist(), artistSongs);
			}
			artistSongs.add(song);
		}
		return byArtist;
	}
	
	public Set<String> getArtists(){
		return byArtist().keySet();
	}
	
	public ArrayList<Song> getSongsForArtist(String artistName){
		return byArtist().get(artistName);
	}

}	
