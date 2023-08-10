package homework_13;

public class HW13_2 {
    public static void main(String[] args) {
        //Задача 3

        //Реализуйте метод sumOfArray (сумма элементов массива),
        // который получает на вход массива и вычисляет сумму его элементов.
        int[] array = {1, 2, 3, 4, 5};
        int sum = sumOfArray(array);
        System.out.println("Сумма элементов массива: " + sum);
        double[] doubles={23.0,24.0,5.0};
        System.out.println("Сумма элементов массива: " +sumOfArray(doubles));
    }
    public static double sumOfArray(double[] doubles) {
        if (doubles == null) return 0;
        double sum = 0;
        for (double value : doubles) {
            sum += value;
        }
        return  sum;

    }
    public static int sumOfArray(int[] array){
        if (array==null) return 0;

        int sum=0;
        for (int value:array){
            sum+=value;
        }
      //  for (int i = 0; i < array.length; i++) {
        //    sum += array[i];
      //  }
        return sum;


    }
}
