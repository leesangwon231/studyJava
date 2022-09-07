package bakjun;

import java.util.Scanner;

public class TwentyThree {
    
    public void setArray(String s){
        String[] a = new String[2];
        a = s.split("\\.");
        System.out.println("정수=>"+a[0]);
        System.out.println("실수=>"+a[1]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TwentyThree tw = new TwentyThree();
        tw.setArray(scanner.nextLine());
        scanner.close();
    }
}
