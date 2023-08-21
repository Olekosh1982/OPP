package lesson_25;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "Hello";
        String str3 = "Hello";
        String str4 = "Hell";
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println(str1 == str2);
        System.out.println(str == str3);
        System.out.println(str == str4);
        System.out.println(str == str1);
        // создается пустая строка
        String str5 = new String();
        //массив символов
        char[] array = {'h', 'e', 'l', 'l', 'o'};
        //строка из массива символов
        String strArr = new String(array);
        System.out.println(strArr);

        String strStr = new String("Hello");
        System.out.println(strStr);
        //Методы строк
        // charAt(int index)возвращает символ на позиции index в строке
        String string = "Hello Java";
        System.out.println(string.charAt(0));
        System.out.println(string.charAt(1));
        System.out.println(string.charAt(2));
        System.out.println(string.charAt(3));
        System.out.println(string.charAt(4));
        System.out.println(string.charAt(5));
        System.out.println(string.charAt(6));
        System.out.println(string.charAt(7));
        System.out.println(string.charAt(8));
        System.out.println(string.charAt(9));

        String strHello = "Hello";
        System.out.println(strHello.charAt(0));
        System.out.println(strHello.charAt(4));

        System.out.println(strStr.length());
        System.out.println(strStr.charAt(str.length() - 1));

// booleon equals(String str)- сравнивает значение строк а не ссылки
        String string1 = new String("Hello");
        String string2 = new String("Hello");
        System.out.println(string1 == string2);//false
        System.out.println(string1.equals(string2));
        System.out.println(string1.equals("Hello"));


        String hello = new String("hello");
        System.out.println(string1.equals(hello));
        //equalsIgnoreCase- сравнивает строки без учета регистра
        System.out.println(string1.equalsIgnoreCase(hello));


        //  савнивать стоки всегда нужно с помощью метода equals  или equalsIgnoreCase
        //int compareTo(String string)-метод сравнивает две строки в соответсвии со значением кажждого символа
        //  в таблице Unicode
        // строки сравниваются в алфавитном порядке.если они равны метод возвращает ноль
        //
        System.out.println("hello".compareTo("hello"));
        System.out.println("ahello".compareTo("chello"));
        System.out.println("chello".compareTo("ahello"));

        String empty = "";
        System.out.println("hello".compareTo(empty));

        String str10 = "begin";
        String str11 = "Begin";
        System.out.println(str11.compareTo(str10));
        System.out.println(str11.compareToIgnoreCase(str10));

        // 1.int indexOf(int ch)- возвращает индекс позиции в строке на котрой первый раз
        // встречается символ ch
        //2.int indexOf(char,int formIndex)- возвращает индекс позиции в строке на которой первый раз встречается
        // символ ch после индекса  formIndex
        //3.int indexOf(String str)-возвращает индекс строки str в той строке на которой он вызывается
        // 4. int indexOf(String str, int formIndex)-возвращает индекс
        // lastIndexOf(char)- то он возвращает последнего вхождения символа в строку

        String stringJava="Java";
        int positionofJ=stringJava.indexOf('J');
        int positionofA=stringJava.indexOf('a');
        int positionofA2=stringJava.indexOf('a',2);
        int positionofAV=stringJava.indexOf("av");
        int positionofVA=stringJava.indexOf("va");
        System.out.println("position of J is "+positionofJ);
        System.out.println("position of a is "+positionofA);
        System.out.println("position of a is "+positionofA2);
        System.out.println("position of a is "+positionofAV);
        System.out.println("position of a is "+positionofVA);

        // lastIndexOf(char) анаглогчно методы  indexOf   этот метод имеет 4 модификации
        stringJava="JJava";
        int lastPosOfA=stringJava.lastIndexOf('a');
        System.out.println("Last index of a is "+lastPosOfA);
        int lastPosOfJ=stringJava.lastIndexOf('J');
        System.out.println("Last index of a is "+lastPosOfJ);
        // метод substring(int beginIndex)- возващает подстраку данной строки начиная символа на позиции beginIndex
        // метод substring( int beginIndex,int endIndex)- возващает подстраку данной строки от  символа до символа
        System.out.println(stringJava.substring(1));
        System.out.println(stringJava.substring(1,4));
        // boolean stertWith(String str, index fromIndex)-проверяет начинается  ли строка со строки str
        String string25="Hello world";
        System.out.println(string25.startsWith("Hello"));
        System.out.println(string25.startsWith("He"));
        System.out.println(string25.startsWith("world"));
        System.out.println(string25.startsWith("world",6));

        string25="Hello world";
        System.out.println(string25.startsWith(""));
        System.out.println(string25.startsWith("H"));

        System.out.println("HELLO".toLowerCase());
        String strToUpperCase="hello";
        System.out.println("hello to upperCase"+strToUpperCase.toUpperCase());

        String hello1="Hello";
        String java="Java";
        System.out.println(hello1.concat("").concat(" Java").concat("!"));
        // join - соединяет строки
        String message=String.join("-","Hello","Java","tra","la","la");
        System.out.println(message);
        String sentence="Hello  java and world";
        String[] words=sentence.split(" ");
        System.out.println(Arrays.toString(words));
        words[1]="javascript";
        String result=String.join("",words);
        System.out.println(result);

        String strA=new String("Java");
        char[] chars=strA.toCharArray();
        for (char c :chars)
            System.out.print(c+" ");

        String value23=String.valueOf(23);
        System.out.println(value23+2);






    }

}
