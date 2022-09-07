package bakjun;

import java.util.Scanner;

public class FourtyFive {
    public void Calculater(String nums){
        String[] sArray = nums.split(" ");
        System.out.println(Integer.parseInt(sArray[0])+Integer.parseInt(sArray[1]));
        System.out.println(Integer.parseInt(sArray[0])-Integer.parseInt(sArray[1]));
        System.out.println(Integer.parseInt(sArray[0])*Integer.parseInt(sArray[1]));
        System.out.println(Integer.parseInt(sArray[0])/Integer.parseInt(sArray[1]));
        System.out.println(Integer.parseInt(sArray[0])%Integer.parseInt(sArray[1]));
        System.out.printf("%.2f",Double.parseDouble(sArray[0])/Double.parseDouble(sArray[1]));
    }

    public static void main(String[] args) {
        FourtyFive fTf = new FourtyFive();
        Scanner scanner = new Scanner(System.in);
        fTf.Calculater(scanner.nextLine());
        scanner.close();
    }
}
