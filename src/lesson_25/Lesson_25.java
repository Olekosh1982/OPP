package lesson_25;

public class Lesson_25 {
    public static void main(String[] args) {
        String str="Hello";
        String str3="Hello";
        String str4="Hell";
        String str1=new String("Hello");
        String str2=new String("Hello");
        System.out.println(str1==str2);
        System.out.println(str==str3);
        System.out.println(str==str4);
    }
}
