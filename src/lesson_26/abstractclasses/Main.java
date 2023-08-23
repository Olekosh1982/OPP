package lesson_26.abstractclasses;

public class Main {
    public static void main(String[] args) {
       // Animal animal=new Animal(); - создать оъект абстрактного класса нельзя
        Animal dog=new Dog();
        Animal lion=new Lion();

        //animal.sound();
        dog.sound();
        lion.sound();
        dog.move();
        lion.move();
    }
}
