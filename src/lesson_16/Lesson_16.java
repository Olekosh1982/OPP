package lesson_16;

public class Lesson_16 {
    public static void main(String[] args) {

        System.out.println("--------cat0");
        Cat cat = new Cat();
        cat.sayMeow();
        System.out.println(cat.age);
        System.out.println("---------cat 1");
        Cat cat1 = new Cat(5);
        System.out.println(cat1.age);
        System.out.println(cat1.name);
        System.out.println("---------cat 2");
        Cat cat2 = new Cat(2, "Boris");
        cat2.sayMeow();
        cat2.running();
        System.out.println("Cat name " + cat2.name);
        System.out.println("Cat age " +cat2.age);
        System.out.println("-------cat 3------");
        Cat catBoris = new Cat(1, "Boris", "red");
        catBoris.sleep();
        System.out.println("Cat name: " + catBoris.name);
        System.out.println("Cat age: " +catBoris.age);
        System.out.println("Cat color: " +catBoris.color);
    }


}
