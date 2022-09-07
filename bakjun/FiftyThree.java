package bakjun;

import java.util.Scanner;

public class FiftyThree {
    public void reverseBoolean(int num){
        if(num == 1 || num == 0){
            if(num==1){
                System.out.println("0");
            }else{
                System.out.println("1");
            }
        }else{
            System.out.println(num);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FiftyThree fTt = new FiftyThree();
        fTt.reverseBoolean(scanner.nextInt());
        scanner.close();
    }
}
