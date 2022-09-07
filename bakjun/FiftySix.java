package bakjun;

import java.util.Scanner;

public class FiftySix {
    public void booleanCheck(String nums){
        String[] array = nums.split(" ");
        if((Integer.parseInt(array[0]) == 1) && (Integer.parseInt(array[0]) == 1)){
            System.out.println("0");
        }else{
            System.out.println("1");
        }
    }    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FiftySix fts = new FiftySix();
        fts.booleanCheck(scanner.nextLine());
        scanner.close();
    }
}
