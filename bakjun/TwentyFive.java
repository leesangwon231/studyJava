package bakjun;

import java.util.Scanner;

public class TwentyFive {
    
    public void calculate(int money){
        int pow;
        int myMoney = money;
        if(myMoney>10000){
            pow = myMoney/10000;
            System.out.println(pow*10000);
            myMoney -= (pow*10000);
        }
        if(myMoney>1000){
            pow = myMoney/1000;
            System.out.println(pow*1000);
            myMoney -= (pow*1000);
        }
        if(myMoney>100){
            pow = myMoney/100;
            System.out.println(pow*100);
            myMoney -= (pow*100);
        }
        if(myMoney>10){
            pow = myMoney/10;
            System.out.println(pow*10);
            myMoney -= (pow*10);
        } 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TwentyFive twF = new TwentyFive();
        twF.calculate(scanner.nextInt());
        scanner.close();
    }
}
