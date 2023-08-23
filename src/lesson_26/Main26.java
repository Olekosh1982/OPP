package lesson_26;

public class Main26 {
    /* StringBuilder
    конструкторы:
    StringBuilder()
    StringBuilder(String str)
    StringBuilder(int capacity)

    методы:
    append(String s)используется для добавление имеющийся строке. Метод может также добавлять целые числа, float,double
     */
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        sb.append(" ").append("Java");
        System.out.println(sb);

        StringBuilder sbInsert=new StringBuilder("Hello");
        sbInsert.insert(1,"World");
        System.out.println(sbInsert);

        StringBuilder sbReplace=new StringBuilder("Hello");
        sbReplace.replace(1,3,"World");
        System.out.println(sbReplace);

        StringBuilder sbDelete=new StringBuilder("Hello");
        sbDelete.delete(1,3);
        System.out.println(sbDelete);

        //reverse
        StringBuilder sbReverse=new StringBuilder("hello");
        sbReverse.reverse();
        System.out.println(sbReverse);


    }
}
