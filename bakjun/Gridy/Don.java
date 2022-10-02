package bakjun.Gridy;

import java.util.Scanner;

public class Don {
    public int calcuLator(){
        int sum = 1000;
        int count =0;
        int[] array = {500,100,50, 10,5 ,1};
        
        Scanner scanner = new Scanner(System.in);
        
        int pay = scanner.nextInt();
        
        sum -= pay;
        for (int i = 0; i < array.length; i++) {
            if(sum==0){
                break;
            }
            while (sum != 0) {
                if(sum<array[i]){
                    break;
                }
                count++;
                sum -= array[i];
            }
        }
        scanner.close();
        return count;
    }

    public static void main(String[] args) {
        Don d = new Don();
        System.out.println( d.calcuLator());
    }
}
