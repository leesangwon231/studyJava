package bakjun;

import java.util.Scanner;

public class Twenty {

    public static void main(String[] args) {
        String[] jumin = new String[2];
        Scanner s = new Scanner(System.in);
        jumin = s.nextLine().split("-");
        System.out.println(jumin[0]+jumin[1]);
        s.close();
    }
    
}
