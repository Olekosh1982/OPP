package homework_04;

public class HomeWork04_2 {
    public static void main(String[] args) {
        String str1= "Java";
        String str2="is";
        String str3="a";
        String str4="powerful";
        String str5= "language";

        String str6 = str1.concat(str2)+str2.concat(str3)+str3.concat(str4)+str4.concat(str5);
        System.out.println(str6);
        str6 = str1 + " " + str2+ " " +str3 + " " + str4 + " " + str5;
        System.out.println(str6);

        String originalString = "Java is a powerful language.";

        // Замена "powerful" на "super"
        String modifiedString = originalString.replace("powerful", "super");

        // Проверка, содержит ли строка подстроку "age"
        boolean containsAge = modifiedString.contains("age");

        System.out.println("Исходная строка: " + originalString);
        System.out.println("Результат после замены: " + modifiedString);
        System.out.println("Строка содержит подстроку \"age\": " + containsAge);

    }
}
