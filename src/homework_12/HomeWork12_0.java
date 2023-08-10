package homework_12;

public class HomeWork12_0 {
    public static void main(String[] args) {
        //Задача 0
        //
        //Написать методологический прием целочисленного числа и проверяющий ли первоначальный состав.
        // истина, а не ложь

        // простое число это число,которое делится на себя и на единицу.


        System.out.println(printMethod(2));

    }

    public static boolean printMethod(int x) {
        boolean res=true;
        if (x<=1) return  false;

            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    return  false;//число здесь непростое
                }
            }

        return res;
    }
}



