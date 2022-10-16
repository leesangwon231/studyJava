package JavaSin2.Collection;

import java.util.ArrayList;

public class ManageHeight {
    public static void main(String[] args) {
        ManageHeight manage = new ManageHeight();
        manage.printAverage(manage.setData());
        

    }

    public ArrayList<ArrayList<Integer>> setData(){
        
        ArrayList<ArrayList<Integer>> gradeHeight = new ArrayList<ArrayList<Integer>>();

        Integer[] index = {5,4,4,3,5};
        
        Integer[] calssMate = {170,180,173,175,177,160,165,167,186,158,177,187,176, 173,182,181, 170,180,165,177,172};       
        
        int eachclassMateIndex = 0;
        
        for (int i = 0; i < index.length; i++) {
            ArrayList<Integer> eachClass = new ArrayList<Integer>();
            for (int j = 0; j < index[i]; j++) {
                eachClass.add(calssMate[eachclassMateIndex]);
                eachclassMateIndex++;
            }

            gradeHeight.add(eachClass);
           
           
       }

      
       return gradeHeight;
    }


    public void printHeight(ArrayList<ArrayList<Integer>> gradeHeight){
       
        


    }


    public void printAverage(ArrayList<ArrayList<Integer>> gradeHeight){
        
        
        
        for (int i = 0; i < gradeHeight.size(); i++) {
            Double sum = 0.0;
            System.out.println("Class No : "+(i+1));
            for (int j = 0; j < gradeHeight.get(i).size(); j++) {
                sum+=gradeHeight.get(i).get(j);

            }
            System.out.println((i+1)+"반의 평균" + (sum/(gradeHeight.get(i).size())));
        }

    }
}
