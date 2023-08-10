package homework_08;

public class HomeWork08_2 {
    public static void main(String[] args) {
        //Задача 1 Распечатать все числа от 1 до 100, которые составляют 5 без остатка. Используем цикл do-while
        int a=1;
        do {
            if (a%5==0)
                System.out.println(a);
            a++;
        }
        while (a<=100);
        System.out.println("Конец цикла!");
    }
}
