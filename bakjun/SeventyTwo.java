package bakjun;

import java.util.Scanner;

public class SeventyTwo {
    
    public void setNum(int num){
        for (int i = 1; i < num+1; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SeventyTwo sTw = new SeventyTwo();
        sTw.setNum(scanner.nextInt());
        scanner.close();
    }
}
