package bakjun;

import java.util.Scanner;

public class SixtyNine {
    public void judegement(String score){
        switch(score){
            case "A":
                System.out.println("best!!");
                break;
            case "B":
                System.out.println("good!!");
                break;
            case "C":
                System.out.println("run!");
                break;
            case "D":
                System.out.println("slowly");
                break;
            
            }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SixtyNine sTn = new SixtyNine();
        sTn.judegement(scanner.nextLine());
        scanner.close();
    }
}
