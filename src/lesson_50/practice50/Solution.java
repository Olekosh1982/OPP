package lesson_50.practice50;


import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

    /*
    В ресторан периодически попадает заказ. У заказа есть время, когда он был сделан ( milliseconds ).
    Для каждого заказа нужно определить количество заказов, сделанных за N  минут до него.
    @param orderTimes -  массив отсортированных по времени моментов, когда происходили заказы
    @param minutes
    @return  для соответствующего заказа возвращает количество заказов, сделанных в предыдущие minutes минут
    public int[] countOrdersNumber(long[] orderTimes , int minutes)

    long[] orderTimes ={1_000_000, 1_200_000, 1_250_000, 1_300_000, 1_600_000, 1_700_000, 1_800_000, 1_850_000, 1_890_000}
    minutes = 5 min
    millis = 5 *60 *1000 = 300 000
    int[] result =    {0, 1, 2, 3, 1, 1,2,3,4 }

    написать метод с использованием двусторонней очереди

    Алгоритм:
    1. создать массив result (  количество элементов в нем равно количеству элементов во входящем массиве)
    2. перевести минуты во втором параметре  в миллисекунды
    3. Создать новую  ArrayDeque

    {1_000_000, 1_200_000, 1_250_000, 1_300_000, 1_600_000, 1_700_000, 1_800_000, 1_850_000, 1_890_000}
     */
    public int[] countOrdersNumber(long[] orderTimes , int minutes){
        int[] res=new int[orderTimes.length];
        Deque<Long> deque=new ArrayDeque<>();
        long millis=minutes*60L*1000;
        int i=0;
        for(long orderTime:orderTimes){
            deque.addLast(orderTime);
            while (orderTime-deque.getFirst()>millis) {
                deque.removeFirst();
            }
        res[i++]=deque.size()-1;
        }
        return  res;
    }
}
