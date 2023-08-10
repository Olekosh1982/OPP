package homework_14;

import java.util.Arrays;

public class HW14_2 {
    public static void main(String[] args) {
     //   Задание 1
     //   Написан метод обмена, принимающий на вход массив чисел, и два индекса.
        //   Метод должен поменять местами, значения, хранящиеся в этих индексах
      //  {0, 1, 2, 3, 4, 5, 6} -> swap(arr, 1, 5} -> {0, 5, 2, 3, 4, 1, 6}
   // Если индексы за массивом?
   // Метод перегрузки для работы с массивами строк.
        int[] array=new int[]{ 0, 1, 2, 3, 4, 5, 6 };
        System.out.println("Массив до вызова метода "+Arrays.toString(array));

        intArrays(array, 1, 5);

        printArray(array);

            }

            public static void intArrays(int[] array, int index1, int index2) {
                if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
                    System.out.println("Индексы за  массивoм .");
                    return;
                }

                int temp = array[index1];
                array[index1] = array[index2];
                array[index2] = temp;
            }

            public static void printArray(int[] array) {
                for (int num : array) {
                    System.out.print(num + " ");
                }

                System.out.println();


            }
        }




