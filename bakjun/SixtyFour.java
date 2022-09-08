package bakjun;

import java.util.Scanner;

public class SixtyFour {
    public void checkIngBoolean(String nums){
        String array[] = nums.split(" ",3);
        int a = Integer.parseInt(array[0]); //3
        int b = Integer.parseInt(array[1]);  //4
        int c = Integer.parseInt(array[2]);  //2
        int result = (a>b)? (b>c)?c : b : (a>c)? c : a;
        System.out.println(result);

    }   

    public static void main(String[] args) {
        SixtyFour sIf = new SixtyFour();
        Scanner scanner = new Scanner(System.in);
        sIf.checkIngBoolean(scanner.nextLine());
        scanner.close();
    }
}
