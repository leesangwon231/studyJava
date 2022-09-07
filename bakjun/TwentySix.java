package bakjun;

import java.util.Scanner;

import javafx.scene.transform.Scale;

public class TwentySix {
    
    public void makeTime(String times){
        String[] timeS = times.split(":",3);
        System.out.println(timeS[1]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TwentySix twS = new TwentySix();
        twS.makeTime(scanner.nextLine());
        scanner.close();
    }
}
