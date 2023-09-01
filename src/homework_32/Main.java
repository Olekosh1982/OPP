package homework_32;

public class Main {
    /*
    Создайте форму интерфейса, содержащую методы для подсчета площади и периметра фигур,
    а также классы прямоугольников и кругов, реализующие этот интерфейс.

В методе main создайте несколько фигур и выведите на печать площадь и периметр каждой.
Написать метод, ограничивающий площадь фигуры нескольких видов, т.е. если площадь прямоугольника = 100,
круг = 50, то общая площадь 150
     */
    public static void main(String[] args) {
        Shape circle=new Circle(10);
        System.out.println("Circle perimeter="+circle.perimeter());
        System.out.println("Circle area="+circle.area());

        Shape rectangle= new Rectangle(10,10);
        System.out.println("Rectangle perimeter="+rectangle.perimeter());
        System.out.println("Rectangle area="+rectangle.area());

        Shape[] shapes={circle,rectangle};
        ShapeCalculator shapeCalculator=new ShapeCalculator();
        System.out.println(shapeCalculator.totalSquare(shapes));

    }
}
