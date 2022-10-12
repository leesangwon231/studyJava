package bakjun.Gridy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Juwerly1202 {
    
    public int robber(){
        
        Scanner scanner = new Scanner(System.in);
    
        String jwerlyAndBag[] = scanner.nextLine().split(" "); // 보석의 갯수 , 가방의 갯수
        
        String jwerlyPriceAndWeight[][] = new String[Integer.parseInt(jwerlyAndBag[0])][2]; // 보석의 갯수에 대한 각각의 무게와 가격
        
        Integer bag[] = new Integer[Integer.parseInt(jwerlyAndBag[1])]; // 도둑이 가방의 갯수에 대한 각각의 무게
        
        for (int i = 0; i < Integer.parseInt(jwerlyAndBag[0]); i++) {
            
            jwerlyPriceAndWeight[i]  =  scanner.nextLine().split(" ");
        }

        
        Arrays.sort(jwerlyPriceAndWeight, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2){
                
                    return Integer.parseInt(o2[1])-Integer.parseInt(o1[1]);
                
            }
        });
        
        for (int j = 0; j < Integer.parseInt(jwerlyAndBag[1]); j++) {
            bag[j] = scanner.nextInt();
        }

        scanner.nextLine();
        int sum = 0;

        for (int i = 0; i < bag.length; i++) {
            for (int j = 0; j < jwerlyPriceAndWeight.length; j++) {
                if(jwerlyPriceAndWeight[j][0].equals("-1")){
                    continue;
                }
                if(bag[i]>=Integer.parseInt(jwerlyPriceAndWeight[j][0])){
                    sum +=  Integer.parseInt(jwerlyPriceAndWeight[j][1]);
                    jwerlyPriceAndWeight[j][0] = "-1";
                  
                    break;
                }
            }
        }

        scanner.close();
        return sum;
    }

    public static void main(String[] args) {
        Juwerly1202 j = new Juwerly1202();
        System.out.println(j.robber());
    }
}
