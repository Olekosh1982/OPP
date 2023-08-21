package lesson_24.shapes;

public class Rectangle extends Shape{
    private  int height;
    private  int width;
    public Rectangle(int height,int width){
        this.height=height;
        this.width=width;
    }

    @Override
    public void calculateSguare() {
       int square=height*width;
        System.out.println("Площадь:"+square);
    }

    @Override
    public void peremeter() {
        int remiter= 2*(height + width);
        System.out.println("Периметр:"+remiter);
    }
}
