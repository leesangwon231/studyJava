package twelve;

public class NestedValueReference {
    public int publicInt = 0;
    protected int protectedInt =1;
    int justInt = 2;
    private int privateInt =3;
    static int staticInt = 4;
    
    static class StaticNested{
        private int StaticNestedInt =99;
        public void setValue(){
            staticInt = 14;
        }
    }

    class Inner{
        private int innerValue=100;
        public void setValue(){
            publicInt =20;
            protectedInt= 21;
            justInt =22;
            protectedInt =23;
            staticInt = 24;
            
        }
    }

    public void setValue(){
        EventListener2 listener = new EventListener2() {
            public void onClick(){
                publicInt =30;
                protectedInt= 31;
                justInt =32;
                protectedInt =33;
                staticInt = 34;
            }
        };
    }

    public static void main(String[] args) {
        NestedValueReference a = new NestedValueReference();
        

    }
}
