package thirteen;

public class ExceptionExample2 {

    public static void main(String[] args) {
        ExceptionExample2 sample = new ExceptionExample2();
       
     
        sample.throwException(1);
       
       
        
    }

    public void throwException(int number) {
        try {
           int[] a = new int[3];
           System.out.println(a[4]);
            
        } catch(Exception e){
            System.out.println("dd");
        }
    }
    
}
