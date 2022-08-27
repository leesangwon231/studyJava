package six;

public class DoitSix {

    /**
     * 예치 기간에 따른 이율
     * @param day 예치 기간
     * @return 예기치기간에 따른 이율
     */
    public double getInterestRate(int day) {

        double income = 0.0;

        if (day <= 90) {
            income = 0.005;
        } else if (day >= 91 && day <= 180) {
            income = 0.01;
        } else if (day >= 181 && day <= 364) {
            income = 0.02;
        } else {
            income = 0.056;
        }

        return income;
    }

    public double calculateAmount(int day, long amount) {
        double amountinterest = amount * getInterestRate(day);
        double sum = amount + amountinterest;
        return sum;
    }

    public static void main(String[] args) {
        DoitSix sample = new DoitSix();
        for (int day = 1; day < 366; day++) {
            if (day % 10 == 0) 
                System
                    .out
                    .println(day + "일 =>" + sample.calculateAmount(day, 1000000));
            }
        
    }
}
