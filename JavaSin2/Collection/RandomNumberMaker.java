package JavaSin2.Collection;

import java.util.HashSet;
import java.util.Random;

public class RandomNumberMaker {
  
    public static void main(String[] args) {
        RandomNumberMaker r = new RandomNumberMaker();

        int count = 0;

        while(count != 10){
            System.out.println(r.getSixNumber());
            count ++;
        }
    }

    public HashSet<Integer> getSixNumber(){
        Random r = new Random();
        HashSet<Integer> hSample = new HashSet<Integer>();

        
        while(hSample.size() != 6){
            hSample.add(r.nextInt(45));
        }


        return hSample;
    }
}
