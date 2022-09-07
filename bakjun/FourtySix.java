package bakjun;

import java.util.Scanner;

public class FourtySix {
    public void splitAverage(String splatAverageNums){
        String array[] = splatAverageNums.split(" ");
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += Integer.parseInt(array[i]);
        }

        System.out.println(sum);
        System.out.printf("%.1f",sum/array.length+0.0);
    }

    public static void main(String[] args) {
        FourtySix fTs = new FourtySix();
        Scanner scanner = new Scanner(System.in);
        fTs.splitAverage(scanner.nextLine());
        scanner.close();
    }
}
