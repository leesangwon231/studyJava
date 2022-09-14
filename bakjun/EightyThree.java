package bakjun;

import java.util.Scanner;

public class EightyThree {
    public void threeGame(int num){
        for (int i = 1; i <= num; i++) {
            if(i%3 == 0){
                System.out.print("X ");
            }else{
                System.out.print(i+" ");
            }

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EightyThree eTt = new EightyThree();
        eTt.threeGame(scanner.nextInt());
        scanner.close();
    }
}
