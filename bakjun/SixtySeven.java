package bakjun;

import java.util.Scanner;

public class SixtySeven {

    public void judegement(int num){
        if(num<0){
            System.out.println("minus");
            if(num%2==0){
                System.out.println("even");
            }else{
                System.out.println("odd");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SixtySeven sTs = new SixtySeven();
        sTs.judegement(scanner.nextInt());
        scanner.close();
    }
    
}
