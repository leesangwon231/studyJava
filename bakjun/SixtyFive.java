package bakjun;

import java.util.Scanner;

public class SixtyFive {
    
    public void judegement(String nums){
        String array[] = nums.split(" ",3);
        for (int i = 0; i < array.length; i++) {
            if(Integer.parseInt(array[i])%2 ==0){
                System.out.println(array[i]);
            }
        }
    }

    public static void main(String[] args) {
        SixtyFive sTf = new SixtyFive();
        Scanner scanner = new Scanner(System.in);
        sTf.judegement(scanner.nextLine());
        scanner.close();
    }
}
