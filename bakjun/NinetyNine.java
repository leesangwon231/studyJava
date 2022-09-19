package bakjun;
import java.util.Scanner;

public class NinetyNine {

    int miro[][];
    int time = 0; 

    public NinetyNine(){
        this.miro = new int[10][10];
    }

    public void setRoad(String road){
        String Eachroad[] = road.split(" ");
        for (int i = 0; i < Eachroad.length; i++) {
            miro[time][i] = Integer.parseInt(Eachroad[i]);
        }
        time++;
    }

    public void printAnt(){
        System.out.println("===================\n");
        for (int i = 0; i < time; i++) {
            for (int j = 0; j < time; j++) {
                System.out.print(miro[i][j]+" ");   
            }
            System.out.println(" ");
        }
    }

    public void moveAnt(){
        int memoryLoc = 1;
        miro[1][1] = 9;
        for (int i = 1; i < time; i++) {
            for (int j = memoryLoc; j < time; j++) {
                if (miro[i][j]==2) {
                    miro[i][j] = 9;
                    return;
                }
                if(miro[i][j+1]==1){
                    miro[i][j] = 9;
                    memoryLoc = j;
                    break;
                }else{
                   miro[i][j] = 9; 
                }
                
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NinetyNine nIn = new NinetyNine();
        while (nIn.time != 10) {
            nIn.setRoad(scanner.nextLine());
        }
        nIn.moveAnt();
        nIn.printAnt();
        scanner.close();

    }
}
