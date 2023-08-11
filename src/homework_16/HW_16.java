package homework_16;

public class HW_16 {
    public static void main(String[] args) {
        System.out.println("-------");
        Dog dog = new Dog("Djem", "Gray", "Persian", "7kg", "23", 2);

        System.out.println(dog.name);
        System.out.println(dog.color);
        System.out.println(dog.breed);
        System.out.println(dog.weight);
        System.out.println(dog.medals);
        System.out.println(dog.age);
        dog.bark();
        dog.sleep();
        dog.runaway();
        dog.jump();

    }
}
