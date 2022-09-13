package bakjun;

import java.util.Scanner;

public class SeventyFive {
    public void countDownZero(int num){
        while (num>=0) {
            System.out.println(num);
            num--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SeventyFive sTf = new SeventyFive();
        sTf.countDownZero(scanner.nextInt());
        scanner.close();
    }
}
