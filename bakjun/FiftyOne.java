package bakjun;

import java.util.Scanner;

public class FiftyOne {
    public void booleanCheck(String booleanNums){
        String array[] = booleanNums.split(" ");

        if(Integer.parseInt(array[1]) >= Integer.parseInt(array[0])){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FiftyOne fto = new FiftyOne();
        fto.booleanCheck(scanner.nextLine());
        scanner.close();
    }
}
