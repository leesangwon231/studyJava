package bakjun;

import java.util.Scanner;

public class EightyFour {
    public void makecountRGB(String rgb){
        String array[] = rgb.split(" ");
        int count=0;
        for (int i = 0; i < Integer.parseInt(array[0]); i++) {
            for (int j = 0; j < Integer.parseInt(array[1]); j++) {
                for (int j2 = 0; j2 < Integer.parseInt(array[2]); j2++) {
                    System.out.println(i+" "+j+" "+j2+" ");
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EightyFour eTf = new EightyFour();
        eTf.makecountRGB(scanner.nextLine());
        scanner.close();
    }
}
