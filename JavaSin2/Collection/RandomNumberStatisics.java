package JavaSin2.Collection;

import java.util.Hashtable;
import java.util.Random;
import java.util.Set;

public class RandomNumberStatisics {
    


    Hashtable<Integer,Integer> hashTable = new Hashtable<Integer,Integer>();

    public static void main(String[] args) {
        RandomNumberStatisics r = new RandomNumberStatisics();
        r.getRandomNumberStatics();
    }


    public void getRandomNumberStatics(){
        Random rss = new Random();
        
        for (int i = 0; i < 60; i++) {
            putCurrentNumber(rss.nextInt(50));
        }

        printStatistics();

    }

    public void putCurrentNumber(Integer tempNumber){
 
        if(hashTable.containsKey(tempNumber)){
            hashTable.put(tempNumber, hashTable.get(tempNumber)+1);
        }else{
            hashTable.put(tempNumber, tempNumber);
        }
    }

    public void printStatistics(){
        Set<Integer> setEach = hashTable.keySet();

       for (Integer integer : setEach) {
            if(integer%10-1 == 0){
                System.out.println();
            }else{
                System.out.print(integer+"="+hashTable.get(integer)+" ");
            }
       }
    }

    
}
