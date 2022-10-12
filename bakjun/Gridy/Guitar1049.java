package bakjun.Gridy;

import java.util.Arrays;
import java.util.Scanner;

public class Guitar1049 {

    public int buyguitarRope(){

        Scanner scanner = new Scanner(System.in);

        String guitarRopeBrand[] = scanner.nextLine().split(" ");

        int lope = Integer.parseInt(guitarRopeBrand[0]);

        int brandKind = Integer.parseInt(guitarRopeBrand[1]);
        
        int sum = 0;

        int pack[] = new int[brandKind];
        int each[] = new int[brandKind];

        for (int i = 0; i < Integer.parseInt(guitarRopeBrand[1]); i++) {
           String a[] = scanner.nextLine().split(" ");
           pack[i] = Integer.parseInt(a[0]);
           each[i] = Integer.parseInt(a[1]); 
        }

        Arrays.sort(pack);
        Arrays.sort(each);
        int packoNe = 0;
        
        if(lope % 6 ==0){
            packoNe = (lope/6);
        }else{
            packoNe = (lope/6) +1;
        }

        
        int allPack =  packoNe * pack[0];
        int packplusEach = (pack[0]*(lope/6))+(each[0]*(lope%6));
        int allEach = each[0] * lope;
        
        sum = allPack;

        if(sum>packplusEach){
            sum = packplusEach;
        }
        if(sum>allEach){
            sum = allEach;
        }
        

       //패키지로만 살건지 나눠서 살건지



        scanner.close();

        return sum;
    }
    

    public static void main(String[] args) {
        Guitar1049 g = new Guitar1049();
        System.out.println(g.buyguitarRope());
        
    }
}
