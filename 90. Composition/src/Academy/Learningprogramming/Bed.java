package Academy.Learningprogramming;

public class Bed {

    private String style;
    private int pillow;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(String style, int pillow, int height, int sheets, int quilt){
        this.style = style;
        this.height = height;
        this.pillow = pillow;
        this.quilt = quilt;
        this.sheets = sheets;
    }

    public void make(){
        System.out.println("Bed -> making");
    }

    public String getStyle(){
        return this.style;
    }

    public int getPillow(){
        return this.pillow;
    }

    public int getSheets(){
        return this.sheets;
    }

    public int getHeight(){
        return this.height;
    }

    public int getQuilt(){
        return this.quilt;
    }


}
