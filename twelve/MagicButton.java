package twelve;


public class MagicButton {
    public MagicButton(){

    }

    private EventListener2 listner;

    public void setListener(EventListener2 listner){
        this.listner = listner;
    }

    public void onClickProcess(){
        if(listner!=null){
             listner.onClick();
        }
    }

    
}
