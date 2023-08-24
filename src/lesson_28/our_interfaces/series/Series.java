package lesson_28.our_interfaces.series;

public interface Series {
    int getNext();// возвращает следующий номер в последовательности
    void reset();//сброс значеня, возврат к начальному
    void setStart(int a) ;//устанваливает начальное значение

}
