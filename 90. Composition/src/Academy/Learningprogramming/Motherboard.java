package Academy.Learningprogramming;

public class Motherboard {

    private String model;
    private String manufacture;
    private int ramSlot;
    private int cardSlot;
    private String bios;


    public Motherboard(String model, String manufacture, int ramSlot, int cardSlot, String bios){
        this.model = model;
        this.manufacture = manufacture;
        this.ramSlot = ramSlot;
        this.cardSlot = cardSlot;
        this.bios = bios;
    }

    public void loadProgram(String programName){
        System.out.println("program " + programName + " is now loading. . . ");
    }

    public String getModel(){
        return this.model;
    }

    public String getManufacture(){
        return this.manufacture;
    }

    public int getRamSlot(){
        return this.ramSlot;
    }

    public int getCardSlot(){
        return this.cardSlot;
    }

    public String getBios(){
        return this.bios;
    }



}
