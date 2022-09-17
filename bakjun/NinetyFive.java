package bakjun;

import java.util.Scanner;

public class NinetyFive {
    public void takeFastNum(String check){
        String array[] = check.split(" ");
        int fastNum = Integer.parseInt(array[0]);
        for (int i = 1; i < array.length; i++) {
            if(fastNum>Integer.parseInt(array[i])){
                fastNum = Integer.parseInt(array[i]);
            }
        }
        System.out.println(fastNum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NinetyFive nTy = new NinetyFive();
        nTy.takeFastNum(scanner.nextLine());
        scanner.close();
    }
}
