package bakjun;

import java.util.Scanner;

public class Eighty {
    public void sum(int nums){
        int sum = 0;
        for (int i = 1; i <= nums; i++) {
            sum += i;
        }
        System.out.println(sum);
    } 
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Eighty eIy = new Eighty();
        eIy.sum(scanner.nextInt());
        scanner.close();
    }
}
