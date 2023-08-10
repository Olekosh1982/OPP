package homework_05;

import java.util.Random;

public class HomeWork05_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt(10);
        System.out.println(randomInt);
        int var1=random.nextInt(20);
        System.out.println("  Случайное Число  "+var1);

        boolean b1=(var1%2==0);/*Число четное, остаток от деления на 2 равен 0*/
        System.out.println( " Число " +var1+" Четное "+b1);

        boolean b2=(var1%3==0);/*Число нечетное, остаток от деления на 3 равен 0*/
        System.out.println( " Число " +var1+" Кратное 3  "+b2);

        boolean b3=(b1)&(b2);/*Число четное и кратное на 3*/
        System.out.println( " Число " +var1+ " Четное " +b1+ " кратное на 3 " +b2+ " четное и кратное на 3 " +b3);
    }
}
