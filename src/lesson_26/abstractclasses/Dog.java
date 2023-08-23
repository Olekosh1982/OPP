package lesson_26.abstractclasses;

public class Dog extends Animal{// дочерние классы должны обязательно реализовывать абстрактные классы родительского класса
    public void sound(){
        System.out.println(" a dog woofs");
    }
    public void move(){
        System.out.println("a dog can jump");
    }

}
