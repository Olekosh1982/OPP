package lesson_18;

import java.util.Arrays;

public class Lesson_18 {
    public static void main(String[] args) {
     //   int[] array=new int[2];
     //   int var =10;
      //  array[0]=var;
      //  System.out.println(Arrays.toString(array));

      //  int var2=25;
      //  array[1]=25;
        RubberArray rb=new RubberArray();
        rb.printArray();
        rb.add(11);
        rb.add(22);
        rb.add(33);
        rb.printArray();
    }
}
