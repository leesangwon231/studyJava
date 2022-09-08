package bakjun;

import java.util.Scanner;

public class SixtySix {
    public void judegement(String nums){
        String array[] = nums.split(" ",3);
        for (int i = 0; i < array.length; i++) {
            if(Integer.parseInt(array[i])%2==0){
                System.out.println("even");
            }else{
                System.out.println("odd");
            }
        }
    }   

    public static void main(String[] args) {
        SixtySix sTs = new SixtySix();
        Scanner scanner = new Scanner(System.in);
        sTs.judegement(scanner.nextLine());
        scanner.close();
    }
}
