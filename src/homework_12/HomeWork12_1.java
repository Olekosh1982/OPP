package homework_12;

import java.util.Random;

public class HomeWork12_1 {
    public static void main(String[] args) {
        Random random=new Random();

        int[] arrayTest = {-10, 0, 7, 12, 11, 1};
        countPrime(2,3);
        System.out.println("Простых чисел в массиве " + countPrime(2,3));


        String[] strings={"str1","str2","str3","long string"};

       // Задание 1

       // Написать метод, принимающий массив чисел.
        // Метод должен восстановить количество чисел в массиве.
        // Для проверки на «простоту» рекомендуется использовать метод из задачи 0.

    }
    public static String[] createArray(String[] strings) {
        if (strings == null) return new String[]{};//возвращаем пустой массив
        String snalStr = strings[0];
        String longlStr = strings[0];

        for (String str : strings) {
            if (str.length() < snalStr.length()) {
                snalStr = str;
            }
            if (str.length() > snalStr.length()) {
                longlStr = str;
            }
        }
        String[] result = new String[]{snalStr, longlStr};
        return result;
    }

    public static boolean countPrime(int x, int y) { return x>y;}

}


