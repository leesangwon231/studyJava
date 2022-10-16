package JavaSin2.Collection;

import java.util.ArrayList;

public class ArrayListed {
 
    public static void main(String[] args) {
        ArrayListed al = new ArrayListed();
        al.checkArrayList7();
    }


    public void checkArrayList2(){
        ArrayList<String> lists = new ArrayList<String>();

        lists.add("A");
        lists.add("B");
        lists.add("C");
        lists.add("D");
        lists.add("E");

        lists.add(1,"A1");

        ArrayList<String> lists2 = new ArrayList<String>();

        lists2 = lists;

        lists.add("lists2 add");

        lists2.remove("lists2 add");
        
        for (String list : lists2) {
            System.out.println(list);
        }

    }



    public void checkArrayList5(){
        ArrayList<String> list = new ArrayList<String>();

        
        list.add("A");
        list.add("B");

        int listSize = list.size();
        
        for (int i = 0; i < listSize; i++) {
            System.out.println(list.get(i));
        }

    }


    public void checkArrayList6(){
        ArrayList<String> list = new ArrayList<String>();

        list.add("A");

        String[] strList = list.toArray(new String[0]);

        System.out.println(strList[0]);

    }




    public void checkArrayList7(){
        ArrayList<String> list = new ArrayList<String>();

        list.add("A");
        list.add("B");
        list.add("C");

        String[] strList = list.toArray(new String[3]);

        for (String string : strList) {
            System.out.println(string);
        }
    }
}
