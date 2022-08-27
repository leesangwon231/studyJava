package seven;

public class Array {

    public static void main(String[] args) {
        String[] strings = new String[2];
        Array[] arrays = new Array[2]; 
        strings[0] = "1";
        arrays[0] = new Array();
        System.out.println("0번째"+strings[0]);
        System.out.println("0번째 array"+arrays[0]);
    }
    
}
