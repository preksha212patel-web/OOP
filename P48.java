
import java.util.*;
class MusicPlaylist {
 	public static void main(String[] args) {
 		System.out.println("Preksha Patel");
		System.out.println("240390107031");
 		LinkedList<String> playlist = new LinkedList<String>();
 		playlist.add("Song 1");
 		playlist.add("Song 2");
 		playlist.add("Song 3");
 		playlist.add("Song 4");
 		playlist.add("Song 5");
 		System.out.println("Full Playlist:");
 		System.out.println(playlist);
 		String first = playlist.removeFirst();
 		System.out.println("\nPlaying: " + first);
		System.out.println("Playlist after playing first song:");
 		System.out.println(playlist);
 		String last = playlist.removeLast();
 		System.out.println("\nSkipped: " + last);
 		System.out.println("Playlist after skipping last song:");
 		System.out.println(playlist);
 	}
}