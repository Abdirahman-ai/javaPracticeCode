package Academy.Learningprogramming;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;

    private ArrayList<Song> songs;

    public Album(String name, String artist){
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    } //end constructor

    public boolean addSong(String titleOfSong, double duration){
        if(findSong(titleOfSong) == null){
            this.songs.add(new Song(titleOfSong, duration));
            return true;
        } // end if
        return false;
    } // end addSong

    private Song findSong(String title){
        for(Song checkedSong: this.songs){
            if(checkedSong.getTitle().equals(title)){
                return checkedSong;
            } // end if
        } // end for
        return null;
    } // end findSong

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playList){
        int index = trackNumber -1;
        if(index > 0 && (index <=this.songs.size())){
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track" + trackNumber);
        return false;
    }

}
