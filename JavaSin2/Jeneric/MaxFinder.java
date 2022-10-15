package JavaSin2.Jeneric;

public class MaxFinder {
    public static void main(String[] args) {
        MaxFinder m = new MaxFinder();
        m.testGetMax();
    }
    public void testGetMax(){
        System.out.println(getMax(1,2,3));
        System.out.println(getMax(3,2,1));
        System.out.println(getMax(2,3,1));
        System.out.println(getMax("a","b","c"));
        System.out.println(getMax("b","c","a"));
        System.out.println(getMax("a","b","c"));
        
        
    }

    public <T extends Comparable<T>> T getMax(T...a){
        T maxT = a[0];
        for(T tempT : a){
            if(tempT.compareTo(maxT)<0) maxT = tempT;
        }

        return maxT;

    }
}
