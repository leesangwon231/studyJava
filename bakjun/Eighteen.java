package bakjun;

import java.util.Scanner;

public class Eighteen {

    public static void main(String[] args) {
        String hour;
        String minute;
        String[] a = new String[2];
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextLine().split(":");
        hour = a[0];
        minute = a[1];
        
        System.out.println(hour+":"+minute);
        scanner.close();
    }
    
}
