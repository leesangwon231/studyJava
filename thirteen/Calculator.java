package thirteen;

public class Calculator {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        try {
            calc.pritDrive(1, 2);
            calc.pritDrive(1, 0);
        } catch (MyException e) {
            e.printStackTrace();
        }
        
    }
    
    public void pritDrive(double d1, double d2)throws MyException{
        try {
            if(d2 == 0){
                throw new MyException("Second value can't be zero");
            }
            double result = d1/d2;
            System.out.println(result);
        } catch (MyException e) {
            e.printStackTrace();
        }
        
       
    }
}
