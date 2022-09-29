package bakjun.Gridy;

import java.util.Scanner;


public class room {
    int count = 0;
    int rememberNum = 0 ;
    int howMany = 0;
    public void setMany(int many){
        this.howMany = many;
    }
    public void setRoom(String rooms){
        String array[] = rooms.split(" ");
        if(rememberNum == 0){
            count++;
            rememberNum = Integer.parseInt(array[1]);
        }
        if((rememberNum+1)==Integer.parseInt(array[0]) ){
            count++;
            rememberNum = Integer.parseInt(array[1]);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        room r = new room();
        r.setMany(scanner.nextInt());
        scanner.nextLine();
        while (r.howMany != 0) {
            r.setRoom(scanner.nextLine());
            r.howMany--;
        }
        System.out.println(r.count);
        scanner.close();
    }
}
