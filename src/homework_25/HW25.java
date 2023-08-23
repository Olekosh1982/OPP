package homework_25;

public class HW25 {
    public static void main(String[] args) {
        String str1="Hello Java";
        String str2="rt";
        System.out.println(strEndsWithAnotherStr(str1,str2));

    }
    /*Задача 1
Написать метод, проверяющий заканчивается ли строка содержимым другой строки.
public boolean strEndsWithAnotherStr ( String str1, str2)

Задача2
Написать метод, создающий массив символов из содержимого строки
public char[] createsCharArray( String str)
     */
public static boolean  strEndsWithAnotherStr ( String str1, String str2){
    return str1.endsWith(str2);
}
}
