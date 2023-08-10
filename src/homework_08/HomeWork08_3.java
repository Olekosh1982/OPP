package homework_08;

public class HomeWork08_3 {
    public static void main(String[] args) {
        //Задание 2 Выведите только 7 чисел от 1 до 100, которые составляют 5 без остатка. Используем цикл while
        int a = 1;
        int b = 0;
        while ((a <= 100) && (b < 7)) {
            if (a % 5 == 0) {
                System.out.println(a);
                b++;
            }
            a++;
        }
    }
}
