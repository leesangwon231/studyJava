package eleven;

public class HealthController {
    public static void main(String[] args) {
       int salaryArray[] = new int[]{1000,2000,3000};
       HealthInsurance[] insurance = new HealthInsurance[3];
       insurance[0] = HealthInsurance.getHealthInsurance(salaryArray[0]);
       insurance[1] = HealthInsurance.getHealthInsurance(salaryArray[1]);
       insurance[2] = HealthInsurance.getHealthInsurance(salaryArray[2]);
    
       for (int loop = 0; loop < 3; loop++) {
        System.out.println(salaryArray[loop]+"="+insurance[loop]+","+insurance[loop].getRatio());
       }
    }
}
