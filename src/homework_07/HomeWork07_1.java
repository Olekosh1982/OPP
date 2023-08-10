package homework_07;

import java.util.Random;
import java.util.Scanner;

public class HomeWork07_1 {
    public static void main(String[] args) {
          /* Задача 1 (Использовать операторский переключатель)
Программа предлагает пользователю ввести число от 1 до 7 Если число равно 1,
выводим на консоль «Понедельник»,
 2 – «Вторник» и так далее. Если 6 или 7 – «Выходной». */

        Random random = new Random();
        int var1 = random.nextInt(7);

        switch (var1) {
            case 1: {
                System.out.println(var1 + " Понедельник");
                break;
            }
            case 2: {
                System.out.println(var1 + " Вторник");
                break;
            }
            case 3: {
                System.out.println(var1 + " Среда");
                break;
            }
            case 4: {
                System.out.println(var1 + " Четверг");
                break;
            }
            case 5: {
                System.out.println(var1 + " Пятница");
                break;

            }
            case 6: {
                System.out.println(var1 + " Выходной");
                break;

            }
            case 7: {
                System.out.println(var1 + " Выходной");
                break;

            }
            default: {
                System.out.println("Введено какое-то другое число");
            }
        }
    }
}