package seven;

public class TwoArray {

    public static void main(String[] args) {
        int[][] twoDim = {{1,2,3},{4,5,6}};
        
        //int [][] twoDim = new int[2][3];
        //twoDim[0][1] = 1;
        //twoDim[1][1] = 2;
        

        for (int i = 0; i < twoDim.length; i++) {
            for (int j = 0; j < twoDim[i].length; j++) {
                System.out.println(twoDim[i][j]);
            }
        }

        System.out.println(twoDim.length);

    }
    
}
