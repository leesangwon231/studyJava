package bakjun.Gridy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Rope {
    public int setRope(){
        Scanner scanner = new Scanner(System.in);

        int rope = scanner.nextInt(); //

        Integer[] ropeKg = new Integer[rope];

        for (int i = 0; i < ropeKg.length; i++) {
            ropeKg[i] = scanner.nextInt();
        }
        Arrays.sort(ropeKg,Comparator.reverseOrder());
        
        int w = 0;//100  45 //  75  
        for(int k = 1; k <= rope; k++){
            w = Math.max(w, ropeKg[k-1]*k);
        }
        /*
            https://geehye.github.io/baekjoon-2217/#
        */   
        
    
        scanner.close();
        
        

        return w;

    }

    public static void main(String[] args) {
        Rope r = new Rope();
        System.out.println(r.setRope());
    }
}
