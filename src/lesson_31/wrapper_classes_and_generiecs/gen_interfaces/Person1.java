package lesson_31.wrapper_classes_and_generiecs.gen_interfaces;

public class Person1 implements Personasable<Integer>{
    private String name;
    private int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
