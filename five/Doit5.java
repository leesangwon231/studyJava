package five;
public class Doit5 {

    /**
     * 월급여에서 세금을 뺀 실급여 계산하는 함수
     * @param yearSalary 연봉 입력
     * @return 실급여 반환
     */
    public double getMonthlySalary(int yearSalary){
        double monthlySalary = yearSalary / 12.0 ;
        
        double health =  calculateHealth(monthlySalary);
        double income = calculateTax(monthlySalary);
        double nation = calculateNation(monthlySalary);

        monthlySalary -= health;
        monthlySalary -= income;
        monthlySalary -= nation;

        return monthlySalary;
    }

    /**
     * 근로소득세 계산
     * @param monthlySalary 월급 입력
     * @return 월급에 대한 근로소득세 반환
     */
    public double calculateTax(double monthlySalary){
        double incomeTax = monthlySalary * 0.125;
        System.out.println("근로소득 => " + incomeTax);
        return  incomeTax;
    }

    /**
     * 연금 계산
     * @param monthlySalary 월급 입력
     * @return 월급에 대한 연금 반환
     */
    public double calculateNation(double monthlySalary){
        double nation = monthlySalary * 0.081;
        System.out.println("연금 => " + nation);
        return nation;
    }

    /**
     * 건강 보험료
     * @param monthlySalary 월급여 입력
     * @return 월급여에 대한 건강 보험료 반환
     */
    public double calculateHealth(double monthlySalary){
       double health = monthlySalary*0.135;
       System.out.println("건강보험 => " + health);
       return health; 
    }


    public static void main(String[] args) {
        Doit5 sample = new Doit5();
        System.out.println(sample.getMonthlySalary(20000000));
    }
}
