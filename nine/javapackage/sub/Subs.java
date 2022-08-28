package nine.javapackage.sub;

public class Subs {

    public Subs(){

    }

    public void subClassMethod(){ 
        
    } 
    
    public void publicMethod(){ // 모든 곳에서 접근

    }

    protected void protectedMethod(){ // 같은 패키지 내 상속 받을 경우

    }

    private void privateMethod(){ //같은 클래스에서만 접근

    }

     void voidMethod(){ // 같은 패키지 내에서 접근

    }


    public final static String CLASS_NAME = "SUB";
    public static void subClassStaticMethod(){
        System.out.println("call Static Method");
    }

    public static void main(String[] args) {
        Subs sub = new Subs();
        sub.privateMethod();
    }

}
