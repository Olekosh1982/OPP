package homework_09;

import java.util.Random;

public class HomeWork09_1 {
    public static void main(String[] args) {
         /* Задача 0 Дан массив чисел. *Выберите общественную собрание.
      Заполните случайными значениями.
      Вывести на экран:

      -его значительное значение
      -максимальное
      -среднее арифметическое
      */

        int[] array = new int[10];
        Random random = new Random();


        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int maxValue = myArray[0];
        int  minValue = myArray[0];

        int j = 0;
        int maxIndex = myArray[j];
        int minIndex = myArray[j];
        while (j < myArray.length) {
            if (myArray[j] >= maxValue) {
                maxValue = myArray[j];
                maxIndex = j;
            }
            if (myArray[j] <= minValue) {
                minValue = myArray[j];
                minIndex = j;
            }
            j++;
        }

        System.out.println("Минимальное значение : "+minValue);
        System.out.println("Максимальное значение: "+maxValue);

        double[] myArray1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double result =0;
        int i;
        for(i=0;i<10;i++)
            result =result +myArray1 [i];
        System.out.println("Среднее арифметическое: : "+result /10);
    }
}
