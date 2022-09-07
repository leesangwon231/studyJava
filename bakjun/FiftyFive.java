package bakjun;

import java.util.Scanner;

public class FiftyFive {
    public void booleanCheck(String nums){
        String[] array = nums.split(" ");
        if(Integer.parseInt(array[0]) == 1 || Integer.parseInt(array[1])== 1){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FiftyFive fTf = new FiftyFive();
        fTf.booleanCheck(scanner.nextLine());
        scanner.close();
    }
}
