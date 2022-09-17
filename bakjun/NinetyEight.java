package bakjun;

import java.util.Scanner;

public class NinetyEight {
    int sugar[][];
    int chance;
    int length;
    int where;
    int x;
    int y;
    
    public void makeSugar(String sugarSize){
        String size[] = sugarSize.split(" ");
        sugar = new int[Integer.parseInt(size[0])][Integer.parseInt(size[1])]; 
    }

    public void setChance(int chance){
        this.chance = chance;
    }

    public void setSuggarLoc(String loc){
        String eachLoc[] = loc.split(" ");
        this.length = Integer.parseInt(eachLoc[0]);
        this.where = Integer.parseInt(eachLoc[1]);
        this.x = Integer.parseInt(eachLoc[2]);
        this.y = Integer.parseInt(eachLoc[3]);
    }

    public void scratchSuggar(){
        if (where == 0) {
            for (int i = length; i > 0; i--) {
                sugar[x-1][y-1]=1;
                this.y++;
            }
        }
        if (where == 1) {
            for (int i = length; i > 0; i--) {
                sugar[x-1][y-1]=1;
                this.x++;
            }
        }
        this.chance--;
    }

    public void printSugar(){
        for (int i = 0; i < sugar.length; i++) {
            for (int j = 0; j < sugar.length; j++) {
                System.out.print(sugar[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NinetyEight eTe= new NinetyEight();
        eTe.makeSugar(scanner.nextLine());
        eTe.setChance(scanner.nextInt());
        scanner.nextLine();
        while(eTe.chance != 0){
            eTe.setSuggarLoc(scanner.nextLine());
            eTe.scratchSuggar();
        }
        eTe.printSugar();
        scanner.close();
    }
}
