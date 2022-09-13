package bakjun;

import java.util.Scanner;

public class EightyOne {
    public void printDice(String dices){
        String array[] = dices.split(" ");
        for (int i = 1; i <= Integer.parseInt(array[0]); i++) {
            for (int j = 1; j <= Integer.parseInt(array[1]); j++) {
                System.out.printf("%d %d \n",i,j);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EightyOne eTo = new EightyOne();
        eTo.printDice(scanner.nextLine());
        scanner.close();
    }
}
