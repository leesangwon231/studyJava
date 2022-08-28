package ten;

public class Child extends Parent{
    public Child() {
        
        //System.out.println("Child Constructer");
    }

    public Child(String name){
        
        System.out.println("Child String Constructer 상원");
    }

    public void printAge(){
        System.out.println("printAge() - 18 month");
    }

    public void printName(){
        System.out.println("자식 이름 출력");
        
    }

}
