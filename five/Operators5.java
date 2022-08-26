package five;
public class Operators5 {
    public static void main(String[] args) {
        //Operators5 sample = new Operators5();
        //sample.additive();
        //sample.remainder();
        //sample.plusParami(1, 2);
        //sample.increDecre(3);
        //sample.comparison();
        //sample.doBlindDate(70);
        //sample.doBlindDate(80);
    }

    /**계산 예시 5와 10 사용 */
    public void additive(){

        int value1 = 5;
        int value2 = 10;

        int result = value1 + value2;
        System.out.println("더하기"+result);
        result = value2 - value1;
        System.out.println("빼기"+result);
    }

    /** */
    public void remainder(){
        int value1 = 53;
        int value2 = 10;

        int result = value1 % value2;

        System.out.println(result);
    }

    /**
     * a에서 b만큼 증감하는 함수
     * @param start 증감을 시작할 값
     * @param plus start에서 증감할 값
     */
    public void plusParami(int start,int plus){
        int result = start;
        result += plus;

       System.out.println("증감"+result);
    }

    /**
     * 증감 감소하는 함수
     * @param start 증감 시작하는 값
     */
    public void increDecre(int start){
        int result = start;
        System.out.println(result++); //증감안된 값 출력
        System.out.println(result); // 증감된값 출력
        System.out.println(++result); // 증감되어 출력
    }

    public void comparison(){
        int value1 =1;
        int value2 =2;
        int value3 =3;

        System.out.println(value1 == value2);
        System.out.println(value1 != value3);
    }


    /**
     * 점수에 대한 합격 불합격 판단 하는 함수
     * @param point 해당점수
     */
    public void doBlindDate(int point){
        boolean result = false;
        result = (point>=80) ? true : false;
        System.out.println(point + " => " + result);
    }

    

}
