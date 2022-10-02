package bakjun.Gridy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Bomul {

    public int setData(){
        
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        int finalNum = scanner.nextInt();
        scanner.nextLine();
        String[] a = (scanner.nextLine()).split(" ");
        String[] b = (scanner.nextLine()).split(" ");
        
        
        Arrays.sort(a);
        Arrays.sort(b,Comparator.reverseOrder());

        for (int i = 0; i < finalNum; i++) {
            sum +=Integer.parseInt(a[i])*Integer.parseInt(b[i]);
        }
        System.out.println("========");
        for (int i = 0; i < finalNum; i++) {
            
            System.out.println(a[i]);
        }
        System.out.println("========");

        System.out.println("========");
        for (int i = 0; i < finalNum; i++) {
            
            System.out.println(b[i]);
        }
        System.out.println("========");
        scanner.close();
        return sum;
    }

    public static void main(String[] args) {
        Bomul b = new Bomul();
        System.out.println(b.setData());

        }
    

    }


