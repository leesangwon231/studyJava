package bakjun.Gridy;

import java.util.Arrays;
import java.util.Scanner;

public class Card {
    public void suffle(){
        Scanner scanner = new Scanner(System.in);

        int check = scanner.nextInt();

        int[] cardS = new int[check];

        for (int i = 0; i < check; i++) {
            cardS[i] = scanner.nextInt();
        }

        Arrays.sort(cardS);

        int memory = cardS[0]+cardS[1];
        
        for (int i = 2; i < cardS.length; i++) {
            memory += (memory+cardS[i]);
        }

        System.out.println(memory);
       
        scanner.close();
    }

    public static void main(String[] args) {
        Card c = new Card();
        c.suffle();
    }
}
