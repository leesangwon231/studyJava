package bakjun;

import java.util.Scanner;

public class ThirtyNine {

    public void splitPlus(String nString){
        int sum = 0;
        String[] a = nString.split(" ");
        for (String eachA : a) {
            
            sum += Integer.parseInt(eachA);
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ThirtyNine twN = new ThirtyNine();
        twN.splitPlus(scanner.nextLine());
        scanner.close();
    }
}
