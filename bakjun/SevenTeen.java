package bakjun;

import java.util.Scanner;

public class SevenTeen {
    public static void main(String[] args) {
        String a;
        Scanner s = new Scanner(System.in);
        a=s.nextLine();
        for (int i = 0; i < 3; i++) {
            System.out.print(a+" ");
        }
        s.close();
    }    
}
