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

    public void wildcardStringMethod(WildCardGeneric<?> c){
        Object value = c.getWildcard();
        if(value instanceof String){
            System.out.println(value);
        }
    }

    


}
