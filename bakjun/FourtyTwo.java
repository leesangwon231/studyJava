package bakjun;

import java.util.Scanner;

public class FourtyTwo {
    
    public void splitDevision(String devisionNums){
       
        String[] sArray = devisionNums.split(" ");
        System.out.println(Integer.parseInt(sArray[0])/Integer.parseInt(sArray[1]));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FourtyTwo fTw = new FourtyTwo();
        fTw.splitDevision(scanner.nextLine());
        scanner.close();
    }
}
