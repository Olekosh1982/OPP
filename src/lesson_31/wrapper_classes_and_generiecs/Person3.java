package lesson_31.wrapper_classes_and_generiecs;


    public class Person3 {
        private String name;
        private int age;

        <T> Person3(T name, int age) {
            this.name = name.toString();
            this.age = age;
        }
    }


