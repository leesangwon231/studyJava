package bakjun;

import java.util.ArrayList;
import java.util.Scanner;

public class ThirtyOne {
    
    public void calculate(int num){
        int myNum = num;
        ArrayList<Integer> a = new ArrayList<Integer>();
       
        while(!(myNum<8)){
            a.add(myNum%8);
            myNum = (myNum/8);
        }
        a.add(myNum);

        for (int i = (a.size()-1); i >= 0; i--) {
            System.out.print(a.get(i));
        }
       
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ThirtyOne tO = new ThirtyOne();
        tO.calculate(scanner.nextInt());
        scanner.close();
    }
}
