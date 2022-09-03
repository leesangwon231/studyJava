package thirteen;


public class ExceptionExample {

    
    public static void main(String[] args) {
        ExceptionExample sample = new ExceptionExample();
        sample.arrayOutOfBounds();
    }

    public void arrayOutOfBounds(){
        int[] array = new int[5];
        try{
          System.out.println(array[6]);
        }
       catch(Throwable t){
           // System.out.println(t.toString());
           t.printStackTrace();
        }
        
        System.out.println("This code is run");

    }
}
