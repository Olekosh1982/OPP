package lesson_52.byte_streams;

public class Employee {

    private String name;
    private int age;
    private double salary;

    private boolean isManager;

    public Employee(String name, int age, double salary, boolean isManager) {
        this.setName(name);
        this.setAge(age);
        this.setSalary(salary);
        this.setManager(isManager);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }
}

