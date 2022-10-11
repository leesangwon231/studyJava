package bakjun.Gridy;

import java.util.Scanner;

public class AtoB16953 {
    public int calculate(){
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        String array[] = scanner.nextLine().split(" ");

        long result = Long.parseLong(array[1]);

        long start = Long.parseLong(array[0]);
        
      
        count++;

        while (true) { // 162 81 8 4 2 
            if(result == start){
                break;
            } 
            if(result < start){
                scanner.close();
                count = -1;
                break;                
            } // 40021 
    
                if(result %2 == 0){ // 15 -> 14 
                    result /= 2;
                }else{
                    result -= 1;
                    if(result%10 != 0){
                        scanner.close();
                        count = -1;
                         break;
                    }else{ 
                        result /= 10;
                    }
                    
                }
                count ++;
            
        }
        scanner.close();
        return count;

    }


    public static void main(String[] args) {
        AtoB16953 a = new AtoB16953();
       System.out.println(a.calculate());
    }
}
