package lesson_25;

public class OurStringBuilder {
    public static void main(String[] args) {
        String str="absd";
        System.out.println(str.substring(2));
        System.out.println(str);
        str="frtu";
        //StringBuilder - создания изменяемых строк
        //StringBuilder()
        //StringBuilder(String)
        //StringBuilder(int length)

        // метод append(String s)-добавляет строку к имеющейся

        StringBuilder sb=new StringBuilder("Hello");
        System.out.println(sb);
        sb.append("").append("Java");
        System.out.println(sb);

    }
}
