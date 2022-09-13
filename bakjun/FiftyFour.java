package bakjun;

import java.util.Scanner;

public class FiftyFour {
    public void booleanCheck(String nums){
        String[] array = nums.split(" ");
        System.out.println(array[0].getClass());
        System.out.println(array[1].getClass());
        System.out.println("1".equals(array[0]));
        System.out.println("1".equals(array[1]));
        if((array[0] == "1") && (array[1] == "1")){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FiftyFour ftfo = new FiftyFour();
        ftfo.booleanCheck(scanner.nextLine());
        scanner.close();
    }
}
