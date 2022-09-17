package bakjun;

import java.util.Scanner;

public class NinetySix {
    int[][] baduc;
    int whiteTime;
    int time;

    public NinetySix(){
        baduc = new int[19][19];
    }

    public void setWhiteTime(int whiteTime){
        this.whiteTime = whiteTime;
    }
    
    public void setWhiteRock(String loc){
        String array[] = loc.split(" ");
        baduc[Integer.parseInt(array[0])][Integer.parseInt(array[1])] = 1 ;
        time++;
    }

    public void searchWhite(){
        for (int i = 0; i < baduc.length; i++) {
            System.out.println("\n");
            for (int j = 0; j < baduc.length; j++) {
                System.out.print(baduc[i][j]+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NinetySix nIs = new NinetySix();
        nIs.setWhiteTime(scanner.nextInt());
        scanner.nextLine();
        while (nIs.time != nIs.whiteTime) {
            String loc = scanner.nextLine();
            nIs.setWhiteRock(loc);
        }
        nIs.searchWhite();
        scanner.close();
    }
}
