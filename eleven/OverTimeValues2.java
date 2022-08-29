package eleven;

public enum  OverTimeValues2 {
    THREE_HOUR(18),
    FIVE_HOUR(30),
    WEEKEND_FOUR_HOUR(40),
    WEEKEND_EIGHT_HOUR(60);
    private final int amount;

    OverTimeValues2(int amount){
        this.amount = amount;
    }

    public int getAmount(){
        return amount;
    }


}
