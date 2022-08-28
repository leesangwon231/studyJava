package eight;

public class ManageStudent {


    public Student[] addStudent(){
        Student[] student = new Student[3];
        student[0] = new Student("Lee");
        student[1] = new Student("Min");
        student[2] = new Student("sook","seoul","010xxxxx","xxx@nav.com"); 
        return student;
    }

    public void printStudent(Student[] student){
        for (Student eachStudent : student) {
            System.out.println(eachStudent);
        }
        
    }

    public void testArray(String name, int nums){
        System.out.printf("%s의 이름 숫자는 %d",name,nums);
       
    }
    public static void main(String[] args){
        ManageStudent mg = new ManageStudent();
        Student[] student = mg.addStudent();
        mg.printStudent(student);
        mg.testArray("배열 테스트",1);
    }
    
}
