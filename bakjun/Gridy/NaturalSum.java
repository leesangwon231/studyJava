package bakjun.Gridy;

import java.util.Scanner;

public class NaturalSum {
    public void sum(){

        Scanner scanner = new Scanner(System.in);

        long goal = scanner.nextLong();

        long num = 0L;
        long sum = 0L;
        while(goal > sum){
            num++;
            sum+=num;
        }
        if(sum>goal){
            System.out.println(num-1);
        }else{
            System.out.println(num);
        }
            
            
        
        scanner.close();
    }

    public static void main(String[] args) {
            NaturalSum ns = new NaturalSum();
            ns.sum();
    }
}
