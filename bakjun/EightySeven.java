package bakjun;

import java.util.Scanner;

public class EightySeven {
    public void sumMyself(int mySelf){
        int sum = 0;
        for (int i = 0; i < mySelf; i++) {
            sum += i;
            if(sum>mySelf){
                break;
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EightySeven eTs = new EightySeven();
        eTs.sumMyself(scanner.nextInt());
        scanner.close();
    }
}
