package bakjun;

import java.util.Scanner;

public class TwentyFour {

    String[] strW = new String[30];
    int count = 0;
    
    public void wordSplit(String word){
        
        for (int i = 0; i < word.length(); i++) {
           if(word.substring(i,i+1).trim().length()==0){
            break ;
           }
           else{
            strW[i] = word.substring(i,i+1);
            count++;
           }
        }    
        }
        

    public void printAll(){
        for (int i = 0; i < count; i++) {
            System.out.println("'"+strW[i]+"'"); 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TwentyFour twF = new TwentyFour();
        twF.wordSplit(scanner.nextLine());
        twF.printAll();
        scanner.close();
        
    }
}
