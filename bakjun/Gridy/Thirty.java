package bakjun.Gridy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Thirty {
    
    public void setThirty(){
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        int value = (int) Math.pow(10, Integer.toString(n).length()-1);
        
        Integer[] array = new Integer[Integer.toString(n).length()];
        int[] multivalue = new int[Integer.toString(n).length()];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = n/value;
            multivalue[i] = value;
            n -= (array[i]*value);
            value =value/10;
            if(value == 1){
                array[array.length-1] = n;
                multivalue[array.length-1] = 1;
                break;
            }
            Arrays.sort(array,Comparator.reverseOrder());
        } // 숫자 자르기 완료 , 배수까지

        int maxValue = 0;

        for (int i = 0; i < array.length; i++) { //1
            
        }

        // 2 1 0 
        scanner.close();
    }

    public static void main(String[] args) {
        Thirty t = new Thirty();
        t.setThirty();
    }
    
}
