package ten;

public class Inheritance {


    public void testing(int a){
        System.out.println("a");
    }

    public void testing(int a , int b){
        System.out.println("a,b");
    }
    public static void main(String[] args) {
        Parent[] parentArray = new Parent[3];
        parentArray[0] = new Child();
        parentArray[1] = new Parent();
        parentArray[2] = new Child();

        for (Parent parent : parentArray) {
            if(parent instanceof Child){
                System.out.println("Child");
            } else if(parent instanceof Parent){
                System.out.println("parent");
            }
        }

        System.out.println(parentArray[0] instanceof Parent);
        
    }
    
    
}
