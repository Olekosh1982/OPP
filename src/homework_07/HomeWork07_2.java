package homework_07;

import java.util.Random;

public class HomeWork07_2 {
    public static void main(String[] args) {
        Random random = new Random();

        int note = random.nextInt(12);
        int time=45;

        System.out.println("Оценка: " + note);
        switch (note) {
            case 10:
            case 11:
            case 12:
            {
                System.out.println(" Скажите ему, как вы рады и добавили к оставшемуся на сегодня времени 1 час");
                time +=60;
                break;
            }
            case 7:
            case 8:
            case 9:
            {
                System.out.println(note+" похвалы на экране + ко времени 45 минут");
                time +=45;
                break;
            }
            case 4:
            case 5:
            case 6:
            {
                System.out.println("Нейтральные слова + ко времени 15 минут 3");
                time +=15;
                break;
            }
            case 3: {
                System.out.println("Огорчитесь. Минус 30 минут ко времени оценка меньше");
                time +=30;
                break;
            }
            default:
                System.out.println("Трагедия. Сегодня ТВ смотреть запрещено");
                time = 0;
                break;

        }
        System.out.println("Оставшееся время для просмотра ТВ: " + time + " мин");
    }
}
