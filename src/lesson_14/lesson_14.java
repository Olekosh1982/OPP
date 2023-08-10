package lesson_14;

import java.util.Arrays;
import java.util.Random;

public class lesson_14 {
    public static void main(String[] args) {
        System.out.println("====Task1======");
        // Random random=new Random();
        //  System.out.println();

        System.out.println("=====Task2=====");
        /*
        Написать метод, возвращающий массив целых числе, заданной длины.
        Массив должен быть заполнен случайными числами.
        Прергрузка.Диапозона случайных числе,может быть задан вторым аргументом вызова метода
         */
        int[] myArray = randomArray(8, 50);
        System.out.println(randomArray(8, 50));
        System.out.println("-----------");
        System.out.println(Arrays.toString(myArray));
        System.out.println("======Task3====");

    } //end main

    //Methods area
    public static int[] randomArray(int size, int bound) {
        int boundDtf=100;
        if (size < 0 || bound <= 0) return new int[0];
        if (bound<=0){
            bound=boundDtf;
        }
        Random random = new Random();

        int[] result = new int[size];

        for (int i = 0; i < result.length; ++i) {
            result[i] = random.nextInt(bound);
        }
        return result;
    }
}
