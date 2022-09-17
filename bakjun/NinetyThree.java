package bakjun;

import java.util.Scanner;

public class NinetyThree {

    public int[] makeCheck(int student){
        int[] array = new int[student];
        return array;
    }

    public void checkList(int[] array, String checkStudentNum){
        int list[] = array;
        String studentNum[] = checkStudentNum.split(" ");
        for (String sNum : studentNum) {
            list[Integer.parseInt(sNum)-1]++;
        }
        for (int sNumR : list) {
            System.out.print(sNumR+" ");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NinetyThree nTn = new NinetyThree();
        int[] a = nTn.makeCheck(scanner.nextInt());
        String studentN = "1 3 2 2 5 6 7 4 5 9";
        nTn.checkList(a, studentN);
        scanner.close();
    }

}
