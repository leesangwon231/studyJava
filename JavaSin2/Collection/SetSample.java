package JavaSin2.Collection;

import java.util.HashSet;

public class SetSample {
    public void setData(){
        String a[] = {"a","a","a","a","b","b","b","b","b","c","c","c","c","c","c","d","d","d","d","d","d"};

        HashSet<String> b = new HashSet<String>();

        for (String stringa : a) {
            b.add(stringa);
        }

        if(b.contains("a")){
            System.out.println("a가있어요");
        }

        for (String string : b) {
            System.out.println(string);
        }
    }

    public static void main(String[] args) {
        SetSample sample = new SetSample();
        sample.setData();
    }
}
