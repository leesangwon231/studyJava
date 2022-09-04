package bakjun;

import java.util.Scanner;

public class Twelve {
    public static void main(String[] args) {
        double d;
        System.out.println("입력하세요");
        Scanner scanner = new Scanner(System.in);
        d = scanner.nextDouble();
        System.out.println("입력한 실수 => " + d);
        scanner.close();
    }
}
