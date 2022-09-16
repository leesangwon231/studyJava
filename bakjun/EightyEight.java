package bakjun;

import java.util.Scanner;

public class EightyEight {

    public void printNonThree(int end){

        for (int i = 1; i <= end; i++) {
            if(i%3==0){
                continue;
            }
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EightyEight eTe = new EightyEight();
        eTe.printNonThree(scanner.nextInt());
        scanner.close();
    }
    
}
