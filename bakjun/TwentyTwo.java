package bakjun;

import java.util.Scanner;

public class TwentyTwo {
    String[] a ;
    String s ;
    public TwentyTwo(){
        a = new String[2000];
    }

    public void setChar(String s){
        this.s = s;
    }

    public void changeIndex(){
        for (int i = 0; i < s.length(); i++) {
            if(a[i]==" "){
                a[i] = " ";
            }else{
                a[i] = s.substring(i,i+1);
            }
          
        }

        for (int i = 0; i < s.length(); i++) {
            System.out.print(a[i]);
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
