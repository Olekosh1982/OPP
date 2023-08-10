package homework_10;

import java.util.Arrays;
import java.util.Random;

public class HomeWork10_1 {
    public static void main(String[] args) {
/*Задача 0
Заполнитель массив 20 случайных увеличений чисел.
Программа должна вывести на экран массив,
количество четных чисел в массиве и количество всех четных чисел. */
        int[] array = new int[20];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));

        int count = 0;
        int count1= 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]!=0 && array[i]%2== 0) {
                count++;
                count1++;

                }
            }


        System.out.println("Количество четных чисел в массиве: " + count);
        System.out.println("Сумма количество четных чисел в массиве: " + count1);
    }

    }

