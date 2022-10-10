package bakjun.Gridy;
import java.util.Scanner;

public class Reserve1439 {
    
    public int reserve(){
        Scanner scanner = new Scanner(System.in);

        String basicNum = scanner.nextLine();

        String array[] = basicNum.split("");

        int zero = 0;
        String start = array[0];
        for (int i = 0; i < array.length-1; i++) {
            if(array[i].equals("0")){
                if(array[i+1].equals("1")){
                    zero ++;
                }
            }
        }
        if(array[array.length-1].equals("0")){
            zero++;
        }

        int one = 0;

        for (int i = 0; i < array.length-1; i++) {
            if(array[i].equals("1")){
                if(array[i+1].equals("0")){
                    one ++;
                }
            }
        }
        if(array[array.length-1].equals("1")){
            one++;
        }
        
        if(zero>one){
            return one;
        }else{
            return zero;
        }

    }

    public static void main(String[] args) {
        Reserve1439 r = new Reserve1439();
        System.out.println(r.reserve());
        
    }
}
