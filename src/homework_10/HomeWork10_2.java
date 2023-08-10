package homework_10;

import java.util.Scanner;

public class HomeWork10_2 {
    public static void main(String[] args) {
     /* Задание 1
За каждый месяц банк начисляет к сумме вклада 7% от суммы. Напишите консольную программу,
в которую пользователь вводит сумму вклада и количество месяцев.
А вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
Для суммы суммы с учетом процентов використовуйте цикл за.
Пусть сумма вклада будет типом float.

Введите сумму вклада: 100
Введите срок вклада в месяцах: 1
После 1 месяцев сумма вклада составит 107,00 */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму вклада: ");
        float sum = scanner.nextFloat();

        System.out.print("Введите срок вклада в месяцах: ");
        int mon = scanner.nextInt();

        float stavka = 0.07f;
        float itogo = sum;
        if (mon >= 1 && itogo > 0) {
            for (int i = 1; i <= mon; i++) {
                itogo = itogo + itogo * stavka;
            }
            System.out.printf("После " + mon + " месяцев сумма вклада составит: " + itogo);


        }
    }
}
