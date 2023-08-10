package lesson_18;

import java.util.Arrays;

public class RubberArray {
    int[] array;
    public RubberArray(){
        this.array=new int[0];
    }
    public void add(int value){
        extractarray();
        array[array.length-1]=value;
    }
    public void extractarray(){
        array= Arrays.copyOf(array,array.length+1);
    }
    public void printArray(){
        System.out.print("[");
        for(int i=0;i< array.length;i++){
            System.out.print(array[i]);
            if (i< array.length-1){
                System.out.print(";");
            }
        }
        System.out.println("]");
        System.out.println();
    }
//
    public int size(){
        return array.length;
    }
    public  int sumOfvalue(){
        int sum=0;
    }
}
