package bakjun;

import java.util.Scanner;

public class FourtyThree {
    public void splitDevisionEach(String devisionEachNums){
       
        String[] sArray = devisionEachNums.split(" ");
        System.out.println(Integer.parseInt(sArray[0])%Integer.parseInt(sArray[1]));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FourtyThree fTw = new FourtyThree();
        fTw.splitDevisionEach(scanner.nextLine());
        scanner.close();
    }
}
