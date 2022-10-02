package bakjun.Gridy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class room {
    int count = 0;
    int howMany = 0;
    int room[][];

   
    public void setMany(int many){
        this.howMany = many;
        this.room = new int[this.howMany][2];
    }
   
    public void setRoom(){
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < howMany; i++) {
            String array[] = scanner.nextLine().split(" ");
            room[i][0] = Integer.parseInt(array[0]);
            room[i][1] = Integer.parseInt(array[1]);
        }

        scanner.close();
        
        Arrays.sort(room, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2){
                if(o1[0]==o2[0]){
                    return o1[1]-o2[1];
                }else{
                    return  o1[0]-o2[0];
                }
            }
        });
        int end = room[0][1];
        count++;
        for (int i = 1; i < howMany; i++) {
                if(room[i][0]>=end){
                    count++;
                    end = room[i][1];
                    System.out.println("============");
                    System.out.println(room[i][0]);
                    System.out.println(room[i][1]);
                    System.out.println("============");

                }
            
        }

    }


    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        room r = new room();
        r.setMany(scanner.nextInt());
        r.setRoom();
        System.out.println(r.count);
        scanner.close();
    }
}
