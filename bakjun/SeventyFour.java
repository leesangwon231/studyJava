package bakjun;

import java.util.Scanner;

public class SeventyFour {
    public void countDown(int num){
        while (num != 0) {
            System.out.println(num);
            num--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SeventyFour sTf = new SeventyFour();
        sTf.countDown(scanner.nextInt());
        scanner.close();
    }
}
