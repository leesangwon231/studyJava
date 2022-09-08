package bakjun;

import java.util.Scanner;

public class SixtyEight {
    
    public void checkScore(int score){
        if(score>=90){
            System.out.println("A");
        }else if(score>=70 && score<90){
            System.out.println("B");
        }else if(score>=40 && score<70){
            System.out.println("C");
        }else{
            System.out.println("D");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SixtyEight sTe = new SixtyEight();
        sTe.checkScore(scanner.nextInt());
        scanner.close();
    }
}
