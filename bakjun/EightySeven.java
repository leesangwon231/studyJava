package bakjun;

import java.util.Scanner;

public class EightySeven {
    public void sumMyself(int mySelf){
       if(mySelf%2==0){
            System.out.println("짝수");
       }else{
        System.out.println("홀수");
       }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EightySeven eTs = new EightySeven();
        eTs.sumMyself(scanner.nextInt());
        scanner.close();
    }
}
