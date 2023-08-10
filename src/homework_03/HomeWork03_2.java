package homework_03;

public class HomeWork03_2 {
    public static void main(String[] args) {
        double tovA=1000;
        double tovB=500;
        double sum=tovA+tovB;
        int sale=10;
        double price = sum * (double) (100 - sale) / 100;
        System.out.println(price);


        double sale1 = sum * sale/ 100;
        double sum1 = sum - sale1;

        System.out.println("Платеж: " + sum);
        System.out.println("Скидка : " + sale1);
        System.out.println("Итог : " + sum1);
    }
}
