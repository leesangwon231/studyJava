package bakjun;

import java.util.Scanner;

public class TwentyOne {

    String[] a ;
    String s ;
    public TwentyOne(){
        a = new String[51];
    }

    public void setChar(String s){
        this.s = s;
    }

    public void changeIndex(){
        for (int i = 0; i < s.length(); i++) {
            a[i] = s.substring(i,i+1);
        }

        for (int i = 0; i < s.length(); i++) {
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        TwentyOne twO = new TwentyOne();
        twO.setChar(scanner.nextLine());
        twO.changeIndex();
        
        scanner.close();
    }
}
