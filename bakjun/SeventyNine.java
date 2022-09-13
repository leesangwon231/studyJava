package bakjun;

import java.util.Scanner;

public class SeventyNine {
    
    public void printCatchQ(String strings){
        String array[] = strings.split(" ");
        for (String each : array) {
            if(each.equals("q")){
                break;
            }
            System.out.println(each);
        }
    }

    public static void main(String[] args) {
        SeventyNine sTn = new SeventyNine();
        Scanner scanner = new Scanner(System.in);
        sTn.printCatchQ(scanner.nextLine());
        scanner.close();
    }
}
