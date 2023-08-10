package homework_14;

public class HW14_1 {
    public static void main(String[] args) {
        //Задача 0
        //Написать стандартные переводы всех букв латинского алфавита в верхнем регистре.
        //Примено так : abcdefghijklmnopqrstuvwxyz->ABCDEFGHIJKLMNOPQRSTUVWXYZ
        String str = "abcdefghijklmnopqrstuvwxyz";
        printCharAt(str);
        System.out.println(str);
    }
    public static String printCharAt(String str){
        String result = new String();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    ch = (char) (ch - 32);
                }
                System.out.print(ch);
            }
            return result;
        }

     /*   public static void main(String[] args) {
            String input = "Hello, World!";
            String upperCaseResult = toUpperCaseUsingCharAt(input);
            System.out.println(upperCaseResult); // Вывод: "HELLO, WORLD!"
        }

Написать метод переводящие все маленькие буквы латинского алфавита в строке в верхний регистр.
       toUpperCase() использовать низзя.

        */





}

       //




