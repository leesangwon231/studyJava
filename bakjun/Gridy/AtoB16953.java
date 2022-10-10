package bakjun.Gridy;

import java.util.ArrayList;
import java.util.Scanner;

public class AtoB16953 {
    public int calculate(){
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        String array[] = scanner.nextLine().split(" ");

        int result = Integer.parseInt(array[1]);

        int start = Integer.parseInt(array[0]);

        int b = start;
        
        // 8 1  2  10 1   1 10 0
        while(true){
            count ++; //100
            System.out.println(b);
            
          if(b>result){
            return -1;
            
          }
          if(b==result){
            break;
          }else{
            b *= 2; //200
            System.out.println(b);
            if(b>result){
                return -1;
            }
            count ++;
           
           

           b *= 10;
           b += 1; //2001
           System.out.println(b);
           if(b>result){
            return -1;
           }

           
           if(b == result){
                count ++;
                break;
           }
            
          }
          
          



        }

        return count;

    }


    public static void main(String[] args) {
        AtoB16953 a = new AtoB16953();
       System.out.println(a.calculate());
    }
}
