package twelve;


public class NestedSample {
    
    class MagicButtonListener implements EventListener2{
        public void onClick(){
            System.out.println("magic button clicked !!");
        }
    }    
    public static void main(String[] args) {
        NestedSample nSample = new NestedSample();
        nSample.makeStaticNestedObject();
        nSample.setButtonListener();
    }

    public void makeStaticNestedObject(){
        OuerOfStatic.StaticNested s = new OuerOfStatic.StaticNested();
        OuterOfInner outer = new OuterOfInner();
        OuterOfInner.Inner inner = outer.new Inner();
        NewSample ns = new NewSample();
        NewSample.InnerS nss = ns.new InnerS();
        nss.getValue();
        s.getValue();
    }

    public void setButtonListener(){
        MagicButton button = new MagicButton();
        MagicButtonListener listner = new MagicButtonListener();
        NestedValueReference.StaticNested s = new NestedValueReference.StaticNested();
        NestedValueReference n = new NestedValueReference();
        NestedValueReference.Inner in = n.new Inner();
        in.setValue();
        button.setListener(listner);
        button.onClickProcess();
        System.out.println(n.publicInt);
    }
}
