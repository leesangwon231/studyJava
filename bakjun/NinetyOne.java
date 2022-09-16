package bakjun;

import java.util.Scanner;

public class NinetyOne {
    public void calculate(String set){
        String array[] = set.split(" ");
        int result = Integer.parseInt(array[0]);
        int time = 1;
        while(time != Integer.parseInt(array[3])){
            result *= Integer.parseInt(array[1]);
            result += Integer.parseInt(array[2]);
            time++;
        }
        System.out.println(result);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NinetyOne nIo = new NinetyOne();
        nIo.calculate(scanner.nextLine());
        scanner.close();
    }
}
