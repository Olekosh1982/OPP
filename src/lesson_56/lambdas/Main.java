package lesson_56.lambdas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int height = 1000;
        Flyable f = new Flyable() {
            @Override
            public void fly() {
                System.out.println("Flying at " + height);
            }
        };
        f.fly();
        Flyable fLambda = () -> {
            System.out.println("We are flying at " + height);
        };
        fLambda.fly();
        Walkable w = () -> {
            return "I am walk";
        };
        System.out.println(w.walk());


        Eatable eatable = (food) -> {
            return "A am can eat" + food;
        };
        System.out.println( eatable.eat("apple"));

        List<String> fruits=new ArrayList<>();
        fruits.add("Lemon");
        fruits.add("Kiwi");
        fruits.add("Apple");
        fruits.add("Banan");

        fruits.forEach(
                fruit-> System.out.println(fruit)
        );
        List<Product> items=new ArrayList<>();
        items.add(new Product("mouse",25));
        items.add(new Product("laptop",1000));
        items.add(new Product("keyboard",75));

    }


}


