package bakjun;

import java.util.Scanner;

public class SixtyThree {
    public void checkIng(String nums){
        String array[] = nums.split(" ");
        String result = (Integer.parseInt(array[0]) > Integer.parseInt(array[1])) ? array[0] : array[1];
        System.out.println(result);
    }

    public static void main(String[] args) {
        SixtyThree sTt = new SixtyThree();
        Scanner scanner = new Scanner(System.in);
        sTt.checkIng(scanner.nextLine());
        scanner.close();
    }
}
