package eleven;

public enum  HealthInsurance {
    LEVEL_ONE(1000,0.01),
    LEVEL_TWO(2000,0.02),
    LEVEL_THREE(3000,0.03),
    LEVEL_FOUR(4000,0.04),
    LEVEL_FIVE(5000,0.05);

    private final int maxSalary;
    private final double ratio;

     HealthInsurance(int maxSalary, double ratio){
        this.maxSalary = maxSalary;
        this.ratio = ratio;
    }

    public double getRatio(){
        return ratio;
    }

    public static HealthInsurance getHealthInsurance(int salary){
        HealthInsurance[] health = HealthInsurance.values();
        HealthInsurance result = null;
        
        for (HealthInsurance eachHealth : health) {
            if(eachHealth.maxSalary==salary){
                result = eachHealth;
            }
        }
       return result;
    }
}
