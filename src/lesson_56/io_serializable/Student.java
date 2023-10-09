package lesson_56.io_serializable;

import java.io.Serializable;

public class Student implements Serializable {
    private  String name;
    private  int age;
    private  int regNumber;
    private String address;
    private  String previousEducation;

    public Student(String name, int age, int regNumber, String address, String previousEducation) {
        this.name = name;
        this.age = age;
        this.regNumber = regNumber;
        this.address = address;
        this.previousEducation = previousEducation;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRegNumber() {
        return regNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getPreviousEducation() {
        return previousEducation;
    }
}
