package homework_09;

import java.util.Arrays;

public class HomeWork09_2 {
    public static void main(String[] args) {


/* Задание 1 Дан массив чисел. Поменять местами его многочисленные и отвлекающие элементы
Пример:
{ 5, 6, -25, 0, 31, -15 }  ->  { 5, 6, 31, 0, -25, -15}
*/

                int[] myArray=new int[]{ 5, 6, -25, 0, 31, -15 };

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


                myArray[maxIndex] = minValue;
                myArray[minIndex] = maxValue;

                System.out.println("Массив после замены: " + Arrays.toString(myArray));

            }
}
