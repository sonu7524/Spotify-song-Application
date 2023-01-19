import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static List<Album> albums = new ArrayList<>();
    public static void main(String[] args) {

        Album album1 = new Album("Yo Yo Honey Singh", "Honey Singh");

        album1.addSongtoAlbum("Party abhi Baki hai",5.05);
        album1.addSongtoAlbum("Dil Chori", 4.70);
        album1.addSongtoAlbum("3 Peg", 3.37);
        album1.addSongtoAlbum("Blue Eyes", 5.30);

        Album album2 = new Album("Justin Beber Hits", "Justin Beber");
        album2.addSongtoAlbum("Baby",3.45);
        album2.addSongtoAlbum("Never Say Never", 4.30);
        album2.addSongtoAlbum("Yummy", 4.12);
        album2.addSongtoAlbum("Sorry", 5.53);
        album2.addSongtoAlbum("Purpose",3.45);
        album2.addSongtoAlbum("Let Me Love You", 4.30);
        album2.addSongtoAlbum("Stay", 4.12);
        album2.addSongtoAlbum("What do you mean?", 5.53);

        albums.add(album2);
        albums.add(album1);

        System.out.println(album2.findSong("Sorry"));

        LinkedList<Song> myPlayList = new LinkedList<>();
        album2.addToPlaylistFromAlbum("Baby", myPlayList);
    }
}