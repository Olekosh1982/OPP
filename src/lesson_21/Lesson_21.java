package lesson_21;

import java.util.Arrays;

public class Lesson_21 {
    public static void main(String[] args) {
        int[] ints={34,21,67,41,10,5,0,87,99,38,57,3,77};

        System.out.println(ints.length);
        System.out.println(ArraysUtil.linerSearch(ints,100));
        System.out.println("До сортировки ");
        System.out.println(Arrays.toString(ints));

        ArraysUtil.sortSelection(ints);

        System.out.println("После сортировки ");
        System.out.println(Arrays.toString(ints));

        int numerForSearch=21;
        int idx=ArraysUtil.binarySearch(ints,numerForSearch);
        System.out.println("Индекс числа "+numerForSearch+" = "+idx);
    }
}
