package bakjun;

import java.util.Scanner;

public class EightyFive {
   
    public int makeSound(String soundSize){
        String array[] = soundSize.split(" ");
        int size = 1;
        for (String eachOne : array) {
            size *= Integer.parseInt(eachOne);
        }
        return size;
    }
    
    public void takeEach(int size){
        int each = 0;
        double eachSize = size;
        String array[] = {"byte","KB","MB","GB","TB","PB"};
        if(eachSize<8){
            System.out.println(eachSize+array[each]);
        }else{
            eachSize /= 8;
        }
        while(eachSize >= 1024){
            eachSize /= 1024;
            each++;
        }

        System.out.printf("%.1f%s",eachSize,array[each]);
    } 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EightyFive eTf = new EightyFive();
        eTf.takeEach(eTf.makeSound(scanner.nextLine()));
        scanner.close();

    }
}
