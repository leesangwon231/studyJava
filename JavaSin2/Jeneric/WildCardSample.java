package JavaSin2.Jeneric;

public class WildCardSample {
    public static void main(String[] args) {
        WildCardSample sample = new WildCardSample();
        sample.callWildCardMethod();
    }

    public void callWildCardMethod(){
        WildCardGeneric<String> wildCard = new WildCardGeneric<String>();
        wildCard.setWildcard("A");
        wildcardStringMethod(wildCard);
    }

    public void wildcardStringMethod(WildCardGeneric<String> c){
        String value = c.getWildcard();
        System.out.println(value);
    }


}
