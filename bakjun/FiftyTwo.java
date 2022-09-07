package bakjun;

import java.util.Scanner;

public class FiftyTwo {
    public void booleanCheck(String booleanNums){
        String array[] = booleanNums.split(" ");

        if(Integer.parseInt(array[0]) != Integer.parseInt(array[1])){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FiftyTwo ftw = new FiftyTwo();
        ftw.booleanCheck(scanner.nextLine());
        scanner.close();
    }   
}
