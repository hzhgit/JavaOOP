import model.Student;

public class Main {

    public static void main(String[] args) {
        Student stu = new Student("zach", 23, "male", 1601030035);
        System.out.println(stu.toString());

        Student stu2 = new Student();
        stu2.setName("hezihao");
        stu2.setAge(22);
        stu2.setGender("female");
        stu2.setID_NO(66666666);

        System.out.println(stu2.getName() + "," + stu2.getAge() + "," + stu2.getGender() + "," + stu2.getID_NO());
    }
}
