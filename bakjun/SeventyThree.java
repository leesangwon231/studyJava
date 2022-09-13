package bakjun;

import java.util.Scanner;

public class SeventyThree {
    public void switchArray(String nums){
        int index = 0;
        String array[] = nums.split(" ");
        while(!(array[index].equals("0"))){
            System.out.println(array[index]);
            index++;
        }
    }

    public static void main(String[] args) {
        SeventyThree sTt = new SeventyThree();
        Scanner scanner = new Scanner(System.in);
        sTt.switchArray(scanner.nextLine());
        scanner.close();
    }
}
