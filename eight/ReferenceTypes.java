package eight;



public class ReferenceTypes {
   
    public void callPassByValue(){
        int a = 10;
        String b = "b";
        MemberDTO member = new MemberDTO("sang","11");
        passByValue(a,b,member);
        System.out.println("callPassBy");
        System.out.println("a=>"+a);
        System.out.println("b=>"+b );
        System.out.println("meber.name=>" + member.name);
    } 

    public void passByValue(int a, String b, MemberDTO member){
        a=20;
        b="z";
        member.name = "lee";
        System.out.println("change!!");
        System.out.println("a=>"+a);
        System.out.println("b=>"+b );
        System.out.println("meber.name=>" + member.name);
    }

    public static void main(String[] args) {
        ReferenceTypes ref = new ReferenceTypes();
        ref.callPassByValue();
    } 
}
