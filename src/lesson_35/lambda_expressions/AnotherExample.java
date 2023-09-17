package lesson_35.lambda_expressions;

public class AnotherExample {
    public static int x=1;
    public static int y=2;

    public static void main(String[] args) {
        Summable summable=()->{
            x=3;
            return x+y;
        };
        System.out.println(summable.calculate());
        System.out.println(x);
    }
}
