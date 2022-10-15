package JavaSin2.Jeneric;

public class CarWildcardSample {
    public static void main(String[] args) {
        CarWildcardSample sample = new CarWildcardSample();
        sample.callBoundedWildcardMethod();
    }

    public void callBoundedWildcardMethod(){
        WildCardGeneric<Car> wildcard = new WildCardGeneric<Car>();
        wildcard.setWildcard(new Car("Mustang"));
        boundedWildcardMehtod(wildcard);
    }

    public void boundedWildcardMehtod(WildCardGeneric<? extends Car> c){
        Car value = c.getWildcard();
        System.out.println(value);
    }
}
