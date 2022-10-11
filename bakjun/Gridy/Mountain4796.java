package bakjun.Gridy;

import java.util.ArrayList;
import java.util.Scanner;

public class Mountain4796 {
    public void camping(){
        // 8일중 5일 20일 휴가
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> arrays = new ArrayList<>();

        while(true){
            String campingVacation = scanner.nextLine();
            if(campingVacation.equals("0 0 0")){
                break;
            }
            arrays.add(campingVacation);
        }

        for (int i = 0; i < arrays.size(); i++) {
            
            String array[] = arrays.get(i).split(" "); // 5일 이용 8일중 20일 휴가

            int vacation = Integer.parseInt(array[2]); // 20
    
            int campingDay = (Integer.parseInt(array[2]) / Integer.parseInt(array[1]))* Integer.parseInt(array[0]) ; //10
         
            vacation -=  Integer.parseInt(array[1]) *((Integer.parseInt(array[2]) / Integer.parseInt(array[1]))); // vacation 4
            
            if(vacation<Integer.parseInt(array[0])){
                campingDay += vacation;

            }else{
                campingDay += Integer.parseInt(array[0]);
            }
            
            System.out.println("Case "+(i+1)+": "+campingDay);
        }        
    
        scanner.close();





    }

    public static void main(String[] args) {
        Mountain4796 m = new Mountain4796();
        m.camping();
       
    }
}
