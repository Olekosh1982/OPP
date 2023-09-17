package lesson_35;

import lesson_35.lambda_expressions.OurValue;

public class Main {
    public static void main(String[] args) {
        OurValue ourValue;
        ourValue=()->100.0;
    }
    //()->100.0
    public double return100(){
        return  100.0;
    }
    //()->Math.random()*100;
    public double returnMath(){
        return  Math.random()*100;
    }
}
