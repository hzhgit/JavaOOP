package model;

public class Student {
    private String name;
    private int age;
    private String gender;
    private int ID_NO;

    public Student() {

    }

    public Student(String name, int age, String gender, int ID_NO) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ID_NO = ID_NO;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getID_NO() {
        return ID_NO;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setID_NO(int ID_NO) {
        this.ID_NO = ID_NO;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", ID_NO=" + ID_NO +
                '}';
    }
}
