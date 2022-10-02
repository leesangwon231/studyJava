package bakjun.Gridy;

import java.util.Scanner;

public class coin {

int n = 0; // 동전의 개수
int k = 0; // 목표 합값
int[] coinValue ; // 돈종류 보관 
int countCoin = 0; // 동전의 최소 갯수

public void setNK(String setNums){
    String array[] = setNums.split(" ");
    this.n = Integer.parseInt(array[0])-1;
    this.k = Integer.parseInt(array[1]);
    this.coinValue = new int[k]; 
}

public void setCoinValues(int value){
    coinValue[n] = value;
    n--;
}

public void countLowCoin(){
    for (int i = 0; i <= 9; i++) {
        if (coinValue[i] <= k) {
            k -= coinValue[i];
            countCoin++;
            break;
        } 
    }
}


public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    coin c = new coin();
    c.setNK(scanner.nextLine());
    while (c.n >= 0) {
        c.setCoinValues(scanner.nextInt());
    }
    while (c.k != 0) {
        c.countLowCoin();
    }
    System.out.println(c.countCoin);
    scanner.close();
 
}
    

}
