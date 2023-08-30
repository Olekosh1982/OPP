package lesson_31.wrapper_classes_and_generiecs;

public class Printer {
    public <T> void printArray( T[] values){
        for(T value:values){
            System.out.println(value);
        }
    }
}
