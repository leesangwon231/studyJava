package ten;

public class Dog extends Animal{
    public void setData(String name, String kind, int legCount, int iq, boolean hasWing){
        this.name = name;
        this.kind = kind;
        this.legCount = legCount;
        this.iq = iq;
        this.hasWing = hasWing;
    }

    public void move(){
        System.out.printf("%s 가 움직입니다.",this.name);
    }

    public void eatFood(){
        System.out.printf("%s 가 음식을 먹습니다.",this.name);
    }
    

}
