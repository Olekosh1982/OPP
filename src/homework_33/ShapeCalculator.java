package homework_33;

public class ShapeCalculator {

    public double totalSquare( Shape[] shapes){
        double res = 0;

        for(Shape s: shapes){
            res += s.area();
        }

        return res;
    }

}
