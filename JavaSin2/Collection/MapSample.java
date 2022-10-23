package JavaSin2.Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class MapSample {
   public static void main(String[] args) {
        MapSample mp = new MapSample();
        mp.setTreeMap();
   } 

   public void checkMap(){
        HashMap<String,String> hp = new HashMap<String,String>();
        hp.put("A", "a");
        System.out.println(hp.get("A"));
        System.out.println(hp.get("a"));
   }

   public void checkKeySet(){
    HashMap<String,String> hp = new HashMap<String,String>();
    hp.put("A", "a");
    hp.put("B", "b");
    hp.put("C", "c");

    Set<String> s = hp.keySet();

    for (String str : s) {
        System.out.println(str);
    }

    Collection<String> values = hp.values();

    for (String string : values) {
        System.out.println(string);
    }

   }


   public void setTreeMap(){
    TreeMap<String,String> a = new TreeMap<>(); 
    a.put("1", "a");
    a.put("a", "a");
    a.put("A", "a");
    a.put("7", "A");
    a.put("2", "a");

    Set<String> as = a.keySet();

    for (String stirng : as) {
        System.out.println(stirng);
    }

   }
}

