package bakjun;

import java.util.Scanner;

public class FourtySeven {
    
    public void printMultiple(int muulitNums){
        System.out.println(muulitNums*2);
    }

    public static void main(String[] args) {
        FourtySeven fTs = new FourtySeven();
        Scanner scanner = new Scanner(System.in);
        fTs.printMultiple(scanner.nextInt());
        scanner.close();
    }
}
