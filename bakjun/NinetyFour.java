package bakjun;

public class NinetyFour {
    public void makeArray(String nums){
        String[] array = nums.split(" ");
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[] args) {
        NinetyFour nTf = new NinetyFour();
        nTf.makeArray("10 4 2 3 6 6 7 9 8 5");
        
    }
}
