package bakjun;

import java.util.Scanner;

public class FIftySeven {
    public void booleanCheck(String nums){
        String[] array = nums.split(" ");
        if(Integer.parseInt(array[0]) == Integer.parseInt(array[1])){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FIftySeven ftS = new FIftySeven();
        ftS.booleanCheck(scanner.nextLine());
        scanner.close();
    }
}
