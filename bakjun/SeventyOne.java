package bakjun;

import java.util.Scanner;

public class SeventyOne {
    
    public void switchArray(String nums){
        String array[] = nums.split(" ");

        for (String num : array) {
            if(num.equals("0")){
                break;
            }
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SeventyOne sTo = new SeventyOne();
        sTo.switchArray(scanner.nextLine());
        scanner.close();
    }
}
