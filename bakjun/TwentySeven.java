package bakjun;

import java.util.Scanner;

public class TwentySeven {

    public void changeDate(String date){
        String[] sDate = date.split("\\.",3);
        for (int i = 2; i >= 0; i--) {
            if(i==0){
                System.out.print(sDate[0]);
            }else{
                System.out.print(sDate[i]+"-");
            }
            
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TwentySeven twS = new TwentySeven();
        twS.changeDate(scanner.nextLine());
        scanner.close();
    }
    
}
