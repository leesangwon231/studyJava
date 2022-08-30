package twelve;

public class OuerOfStatic {

     static  class StaticNested{
        private int value = 0;
        public void getValue(){
            System.out.println(value);
        }
    
    }
    

    public static void main(String[] args) {
        StaticNested a = new StaticNested();
        a.getValue();
        
    }
}
