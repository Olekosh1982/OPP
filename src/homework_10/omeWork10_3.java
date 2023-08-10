package homework_10;

import java.util.Arrays;
import java.util.Random;

public class omeWork10_3 {
    public static void main(String[] args) {
       // Задача 2
       // Заполните массив 50 случайными числами от 1 до 100.
        // Программа должна найти, и вывести на экран все обычные числа.
        // Почитайте сколько получилось таких чисел в массиве.
        // Простое число - число, которое передается на целое только на 1 и самого себя.
//  Примеры простых чисел: 3, 5, 7, 11, 13 и т.д.
        int[] array=new int[50];
        Random random=new Random();

        int a=0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(array));

        int countSimple=0;

for (int i=0; i < array.length ; i++){

    boolean isPrine=true;
    if (array[i]==1) {
     isPrine=false;
        System.out.println("Число равно 1" +array[i]);
     continue;
    }
    for(int j=5; isPrine&j<=Math.sqrt(array[i]);i+=6)
        if(array[i]%1==0||array[i]%(j+2)==0){
            isPrine=false;
            break;
        }
    for (int j=2; j<array[i];j++){
        if(array[i]%j==0){
           isPrine=false;
           break;
        }

    }
    if (isPrine){
        System.out.println(array[i] + " ");
        countSimple++;
    }
        }

        System.out.println(" Количество простых чисел в массие: "+countSimple);


    }


}
