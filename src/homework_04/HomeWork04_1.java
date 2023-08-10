package homework_04;

public class HomeWork04_1 {
    public static void main(String[] args) {
        String  str="Olesia";
        System.out.println(str);


        int length = str.length();
        System.out.println(str + " length: " + length);
        char firstChar = str.charAt(0);
        System.out.println("firstChar " + firstChar);
        char lastChar = str.charAt(str.length() - 1);
        System.out.println("lastChar " + lastChar);

        char a = 'O'; // Переменная будет содержать англ букву O
        char b = 'a';// Переменная будет содержать англ букву a
        String name = "Olesia";

        // Получаем первый символ и его десятичный код
        char firstCharacter = name.charAt(0);
        int firstCharacterDecimal = (int) firstCharacter;

        // Получаем последний символ и его десятичный код
        char lastCharacter = name.charAt(name.length() - 1);
        int lastCharacterDecimal = (int) lastCharacter;

        System.out.println("Десятичный код первого символа: " + firstCharacterDecimal);
        System.out.println("Десятичный код последнего символа: " + lastCharacterDecimal);

    }
}
