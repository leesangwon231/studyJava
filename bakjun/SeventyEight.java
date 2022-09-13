package bakjun;

import java.util.Scanner;

public class SeventyEight {

    public void sum(int num){
        int sum = 0;
        while (num>0) {
            if(num%2==0){
                sum += num;
            }
            num--;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SeventyEight sTe = new SeventyEight();
        sTe.sum(scanner.nextInt());
        scanner.close();
    }   
}
