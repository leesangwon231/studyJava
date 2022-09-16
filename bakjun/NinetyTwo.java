package bakjun;

import java.util.Scanner;

public class NinetyTwo {
    public void setFindProblem(String days){
        
        String array[] = days.split(" ");
        int one,two,three;
        int day = 1;
        
    
        do {
            one = two = three = 0;
            if((day%Integer.parseInt(array[0]))==0){
                one = 1;
            }
            if((day%Integer.parseInt(array[1]))==0){
                two = 1;
            }
            if((day%Integer.parseInt(array[2]))==0){
                three = 1;
            }
            if(one+two+three == 3){
                break;
            }
            day++;
        } while ((one+two+three)!=3);

        System.out.println(day);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NinetyTwo nTo = new NinetyTwo();
        nTo.setFindProblem(scanner.nextLine());
        scanner.close();
    }
}
