package Academy.Learningprogramming;

import java.util.ArrayList;

public class Song {


    private String title;
    private double duration;

    public Song(String titleOfSong, double duration){
        this.title = titleOfSong;
        this.duration = duration;
    }


    public String getTitle(){
        return this.title;
    }

    public String toString(){
        return this.title + ": " + this.duration;
    }


}
