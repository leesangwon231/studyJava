package bakjun;

import java.util.Scanner;

public class FiftyEight {
    public void booleanCheck(String nums){
        String[] array = nums.split(" ");
        if((Integer.parseInt(array[0])==0) && (Integer.parseInt(array[1])==0)){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FiftyEight fTe = new FiftyEight();
        fTe.booleanCheck(scanner.nextLine());
        scanner.close();
    }
}
