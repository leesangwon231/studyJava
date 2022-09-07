package bakjun;

import java.util.Scanner;

public class FourtyEight {

    public void multimulti(String multiNums){
        int sum = 1;
        String array[] = multiNums.split(" ");
        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[1]);
        while(b != 0){
            sum *= 2;
            b--;
        }
        System.out.println(a*sum);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FourtyEight fTe = new FourtyEight();
        fTe.multimulti(scanner.nextLine());
        scanner.close();
    }
}
