package six;

public class ControlOfFlow {
 
    public void switchSatement(int numberOfWheel){
        switch (numberOfWheel) {
            case 1:
                System.out.println("한발자전거");
                break;
            case 2:
                System.out.println("두발자전거");
                break;
            case 3:
                System.out.println("세발자전거");
                break;
            default:
                System.out.println("그냥 자전거");
                break;
        }
    }

    public static void main(String[] args) {
        ControlOfFlow sample = new ControlOfFlow();
        sample.switchSatement(1);
        sample.switchSatement(4);
        sample.switchSatement(5);
    }
}
