package Academy.Learningprogramming;

public class Button {
    private String title;
    private onClickListner onClickListner;

    public Button(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setOnClickListner(onClickListner onClickListner){
        this.onClickListner = onClickListner;
    }

    public void onClick(){
        this.onClickListner.onClick(this.title);
    }

    public interface onClickListner{
        void onClick(String title);

        public void onClickListner(String title);
    }
}
