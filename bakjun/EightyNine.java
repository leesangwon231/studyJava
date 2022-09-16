package bakjun;

import java.util.Scanner;

public class EightyNine {
    public void calculate(String set){
        String array[] = set.split(" ");
        int result = Integer.parseInt(array[0]);
        int time = 1;
        while(time != Integer.parseInt(array[2])){
            result += Integer.parseInt(array[1]);
            time++;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EightyNine eTn = new EightyNine();
        eTn.calculate(scanner.nextLine());
        scanner.close();
    }
}
