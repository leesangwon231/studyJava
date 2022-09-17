package bakjun;

import java.util.Scanner;

public class NinetySeven {
    int[][] baduc;

    public NinetySeven(){
        baduc = new int[20][20];
        for (int i = 0; i < baduc.length; i++) {
            for (int j = 0; j < baduc.length; j++) {
                if(j == 11 || j == 13){
                    baduc[i][j] =1;
                }
                if(i == 11 || i == 13){
                    baduc[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < baduc.length; i++) {
            for (int j = 0; j < baduc.length; j++) {
                System.out.print(baduc[i][j]+" ");
            }
            System.out.println("\n");
        }
    }

    public void reflectBaduc(){
        for (int i = 0; i < baduc.length; i++) {
            for (int j = 0; j < baduc.length; j++) {
                if(baduc[i][j]==0){
                    baduc[i][j] = 1;
                }else {
                    baduc[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < baduc.length; i++) {
            for (int j = 0; j < baduc.length; j++) {
                System.out.print(baduc[i][j]+" ");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NinetySeven nIs = new NinetySeven();
        nIs.reflectBaduc();
        scanner.close();
    }    
}
