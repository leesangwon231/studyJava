package bakjun;

import java.util.Scanner;

public class Fourteen {
   public static void main(String[] args) {
    int a , b;
    String[] s = new String[2];
    Scanner scanner = new Scanner(System.in);
    s = (scanner.nextLine()).split(" ");
    a = Integer.parseInt(s[0]);
    b = Integer.parseInt(s[1]);
    System.out.println(b + " " + a);
    scanner.close();
   }
}
