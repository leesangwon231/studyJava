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
        int compareGasolin = Integer.parseInt(cityGasolin[0]);
        for (int i = 0; i < cityKm.length; i++) {
            if(Integer.parseInt(cityGasolin[i])<compareGasolin){
                compareGasolin = Integer.parseInt(cityGasolin[i]);
            }
            sum += Integer.parseInt(cityKm[i]) * compareGasolin;
        }



        System.out.println(sum);
        scanner.close();
    }

        
  

    public static void main(String[] args) {
        Gasolin g = new Gasolin();
        g.coinValue();
    }

}