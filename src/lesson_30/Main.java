package lesson_30;

public class Main {
    // Введение в Анализ  сложности алгоритмов

   /*
    Алгоритм - это последовательность шагов, которая представляет из себя исключительно вычисление и не учитывает
    особенности реализации "компьютерного железа" на котором она запущена.
    Анализ сложности дает возможность узнать как быстро будет работать программа когда она совершает вычисления
    на разных обьемах входных данных
    */

    public int findMax( int[]ints, int n){
        int max = ints[0]; // 2 действия

        // 2 инструкции до запуска цикла - инициализация и проверка условия окончания цикла
        for( int i = 0; i < n; i++){
            if( ints[i] > max) { // 2 действия, которые происходят всегда - поиск в массиве и сравнение
                max = ints[i];
            }
        }
        return max;
    }

    // f(n) = 4 + 2n //  необходимое алгоритму количество интструкций для цикла for  с пустым телом

    // В теории алгоритмов рассматриваются наихудшие сценарии., т.е. в нашем случае это массив, упорядоченный по
    //возрастанию и max  перезаписывается при каждой итерации.

    // 1,2,3,4
    // 4,3,2,1

    // f(n) = 4 + 2n +4n = 4 +6n
    // когда  значение n сильно возарстает , константы не важны, поэтому 4 отбрасываем
    // f(n) = 6n

    // f(n)=n

    /*
    f(n) = 8n +14  -> f(n) = n
    f(n) = 150 *1 -> f(n) = 1

    f(n) = n^2 +3n +234  -> f(n) = n^2

    f(n) = n^3 + 5n +112 -> f(n) = n^3
    f(n) = n + sqrt(n)  f(n) = n


   написать метод, выводящий на экран такой треугольник
    1
    12
    123
    1234
    12345

     */
    public static void drawTriangle(int n){

        for(int i = 0;i<=n;i++){
            System.out.print(i);
        }

        for( int i = 1; i <= n; i++){
            for( int j = 1; j <= i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // вложенный цикл дает поведение f(n) = n^2

    // Если в программе имеется несколько последовательных циклов, то поведение программы определяет самый медленный
    // из них

    public static void main(String[] args) {
        drawTriangle(6);

        char theta =  '\u03f4';
        System.out.println(theta);
       /*
        ϴ(f(n)
        ϴ(1) - алгоритм с константным временем
        ϴ(n) - линейный алгоритм
        ϴ(n^2) - квадратичный алгоритм

        Big O

        0(1) - алгоритм с константным временем.  Сложность такого алгоритма 1
        O(n) -  сложность алгоритма O(n)
        O(n^2) -  сложность алгоритма n^2
        O(log n) логарифмическая сложность

        2^x = 1024
        2^10 = 1024
        логарифм 1024 - это та степень, в которую нужно возвести 2 чтобы получить 1024
        log(1024) = 10

        log(64) = 6
        2^6 = 64


        2^x = 4

        итерация   длина массива
        0           n
        1           n/2 2^1
        2           n/4 2^2
        3           n/8 2^3

        i
        1 = n/2^i
        2^i = n
        i = log(n)





        */
    }




}

