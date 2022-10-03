package bakjun.Gridy;

import java.util.Scanner;

public class Gasolin {
    public void coinValue(){
        
        Scanner scanner = new Scanner(System.in);

        int city = scanner.nextInt();
        scanner.nextLine();
        String[] cityKm = scanner.nextLine().split(" "); // 3
        String[] cityGasolin = scanner.nextLine().split(" "); //4

        int sum = 0;
        for (int i = 0; i < cityKm.length; i++) {
            int a =0;
           
            if(i>0){
                for (int j = 0; j < i; j++) {
                    a += Integer.parseInt(cityKm[i-1])*Integer.parseInt(cityGasolin[i-1]);
                }
                
            }
            int km = 0;
            for (int j = i; j < cityKm.length; j++) {
                km += Integer.parseInt(cityKm[j]);
            }
            
            a += (Integer.parseInt(cityGasolin[i])*km);
            System.out.println(i+"번째 값"+a);
            System.out.println(i+"번째 km"+km);

            if (sum == 0) {
                sum = a;
            }else{
                if (a<sum) {
                    sum = a;
                }
            }
            
                
        }
        System.out.println(sum);
        scanner.close();

        
    }

    public static void main(String[] args) {
        Gasolin g = new Gasolin();
        g.coinValue();
    }
}
