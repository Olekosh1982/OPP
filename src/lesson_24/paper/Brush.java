package lesson_24.paper;

public class Brush extends Pen{

    @Override
    public void draw(String figure) {
        System.out.println("Кисть красиво рисует "+figure);
    }
}
