package bakjun;

import java.util.Scanner;

public class Nineteen {
    public static void main(String[] args) {
        String year;
        String month;
        String day;
        String[] a = new String[3];
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextLine().split("년");
        year = a[0];
        a = a[1].split("월");
        month = a[0];
        a = a[1].split("일");
        day = a[0];
        System.out.println(year+"."+month+"."+day);
        scanner.close();

    }
    
}
