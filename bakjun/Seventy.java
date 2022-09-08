package bakjun;

import java.time.Month;
import java.util.Scanner;

public class Seventy {

    public void checkWeather(int month){
        switch(month){
            case 12:
            case 1:
            case 2:
                System.out.println("winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("fall");
                break;
        }
    }

    public static void main(String[] args) {
        Seventy sVt = new Seventy();
        Scanner scanner = new Scanner(System.in);
        sVt.checkWeather(scanner.nextInt());
        scanner.close();
    }
    
}
