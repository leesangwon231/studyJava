    package bakjun.Gridy;

    import java.util.Scanner;

    public class Range {
        public void range(){
            
            Scanner scanner = new Scanner(System.in);

            int freezeFood = scanner.nextInt();
            
            int[] array = {300,60,10};
            

            if(freezeFood%array[2] != 0){
                System.out.println("-1");
            }else{
            for (int i = 0; i < array.length; i++) {
                int check = 0;    
                while(freezeFood>=array[i]){
                    freezeFood -= array[i];
                    check++;
                    }
                array[i] = check;
            }

            System.out.println(array[0]+" "+array[1]+" "+array[2]);
            }

        
            scanner.close();
        }

        public static void main(String[] args) {
            Range r = new Range();
            r.range();
        }
    }
