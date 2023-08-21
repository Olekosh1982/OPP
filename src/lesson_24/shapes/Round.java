package lesson_24.shapes;

public class Round extends Shape{
    private double radius;
    private static final double PI=3.1415;

    public Round(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateSguare() {
       double square=PI*radius*radius;
        System.out.println("Площадь круга равно "+square);
    }

    @Override
    public void peremeter() {
       double remiter=2*PI*radius;
        System.out.println("Периметр равен "+remiter);
    }
}
