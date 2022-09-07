package bakjun;

import java.util.ArrayList;
import java.util.Scanner;

public class ThirtyTwoThree {
    public void calculate(int num){
        int myNum = num;
        ArrayList<Integer> a = new ArrayList<Integer>();
        String s = " ";
        while(!(myNum<16)){
            a.add(myNum%16);
            myNum = (myNum/16);
        }
        a.add(myNum);

        for (int i = (a.size()-1); i >= 0; i--) {
            s += a.get(i).toString();
        }
        System.out.println(Integer.toHexString(255).toUpperCase());
       
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ThirtyTwoThree tO = new ThirtyTwoThree();
        tO.calculate(scanner.nextInt());
        scanner.close();
    }
}
