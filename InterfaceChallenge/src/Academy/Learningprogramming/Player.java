package Academy.Learningprogramming;

import java.util.List;

public class Player implements ISaveable {

    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, String weapong, int hitPoints, int strength){
        this.name = name;
        this.weapon = "Sword";
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setWeapon(){

    }

    @Override
    public List<String> write() {
        return null;
    }

    @Override
    public void read(List<String> arg) {

    }

    public
}
