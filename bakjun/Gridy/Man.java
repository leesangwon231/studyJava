package bakjun.Gridy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Man {
    
    public void maxMan(){

        Scanner scanner = new Scanner(System.in);

        int check = scanner.nextInt(); //공채수
        int[] checkArray = new int[check]; //공채후 각각의 최대인원

        
        while (check != 0) {
            int checkOut = scanner.nextInt(); // 몇명의 지원자가 있는지
           
            int[][] array = new int[checkOut][2]; //공채에 맞는 2차원 배열
           
            scanner.nextLine();
           
            
            for (int i = 0; i < array.length; i++) {
               array[i] = Arrays.asList(scanner.nextLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray(); // split한 String이차원 배열 int형 으로 형변환
            }
            
            Arrays.sort(array, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2){
                        return  o1[0]-o2[0];
                }
            }); // 2차원 배열 에 값 세팅 오름차순 정렬 까지 마침
            
            int successMan = 1; // 1번은 무조건 합격이라 시작
            int Cutline = array[0][1]; // 해당 1번의 두번째 시험 결과 

            for (int i = 0; i < array.length; i++) {
                if(array[i][1]<Cutline){
                    successMan++;
                    Cutline = array[i][1];
                }
                
            }

            checkArray[check-1] = successMan;
            check --;

        }
        
        scanner.close();

        for (int i = checkArray.length; i > 0 ; i--) {
            System.out.println(checkArray[i-1]); 
        }
    }

    public static void main(String[] args) {
        Man m = new Man();
        m.maxMan();
    }

}
