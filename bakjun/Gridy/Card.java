package bakjun.Gridy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Card {
    public void suffle(){
        Scanner scanner = new Scanner(System.in);

        int check = scanner.nextInt();

        int[] cardS = new int[check];

        for (int i = 0; i < check; i++) {
            cardS[i] = scanner.nextInt();
        }

       
        
        ArrayList<Integer> a = new ArrayList<Integer>();
        
        int memory = cardS[0]+cardS[1];
        
        for (int i = 2; i < cardS.length; i++) {
            
            if(memory>cardS[i]){
                a.add(memory);
                memory = cardS[i];
            }else{
                memory += cardS[i];
            }
            
        } // 10 10 20 20 30 
        a.add(memory); //마지막 40 50
        
        memory = 0; // 20 30 20 -> 20 20 30 ->  20 30 -> 30 40 
        
        while(true){
            Collections.sort(a);
            memory = a.get(0);
            ArrayList<Integer> b = new ArrayList<Integer>();
            for (int i = 1; i < a.size(); i++) {
                if(memory>a.get(i)){
                    b.add(memory);
                    memory = a.get(i);    
                }else{
                    memory += a.get(i);
                }
                
            }

            a.add(memory); 
            for (int i = 0; i < a.size(); i++) {
                b.add(a.get(i));
            }
            a.removeAll(a);
            if(b.size()==2){
                break;
            }
        }
       
        
        scanner.close();
    }

    public static void main(String[] args) {
        Card c = new Card();
        c.suffle();
    }
}
