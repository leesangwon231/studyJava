package seven;

public class Doit7 {
    
    //데이터 세팅
    public int[][] setData(){
        int[][] grageHeights = {{170,180,173,175,177},{160,165,167,186},{158,177,187,176},{173,182,181},{170,180,165,177,172}};
        return grageHeights;
    }
   

    /**
     * 반 번호를 매개 변수로 넘겨주면 해당 반 학생들의 키를 번호순으로 출력 하는 함수
     * @param classNo 반번호
     */
    public void printHeight(int classNo){
            System.out.println("Class No : "+(classNo+1));   
            for (int j = 0; j < setData()[classNo].length; j++) {
                System.out.println(setData()[classNo][j]);
            }
            printAverage(classNo);
        }
    

    public void printAverage(int classNo){
        Double classAverage = 0.0;
        for (int i = 0; i < setData()[classNo].length; i++) {
            classAverage += setData()[classNo][i];
        }
        System.out.println(classNo+"반 평균 : "+(classAverage/setData()[classNo].length));
    }

    public static void main(String[] args){
        Doit7 sample = new Doit7();
        for (int i = 0; i < sample.setData().length; i++) {
            sample.printHeight(i);
        }
        
        
    
    
    
    }
}
