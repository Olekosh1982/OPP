package lesson_59.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.logging.Filter;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int[] ints={10,20,30,40,50,60,70};
        int counter=0;
        for(int i:ints){
            if(i<21)
                continue;
                i=i*2;
                counter++;
                if(counter>3)
                    break;
            System.out.println(i);
        }

        IntStream.of(10,20,30,40,50,60,70)
                .filter(i->i>=21)
                .map(i->i*2)
                .limit(3)
                .forEach(System.out::println);

        Stream<String> empty=Stream.empty();//оздание пустого стрима
        List<String>collection= Arrays.asList("One","Two","Three");//стрим коллекции
        collection.stream();
        String[] array={"One","Two","Three"};
        Arrays.stream(array);//стрим массива
        "abcd".chars();//стрим символов строки

        Stream.of("one","two");// с помощью статистического метода of
        IntStream intStream=IntStream.of(1,2,3);
        IntStream.range(1,3);//[1,3)
        IntStream.rangeClosed(1,3);//[1,3]
        //
        Random random=new Random();
        random.doubles();

        // forEach-перебор элементов,терминальный оператор
        Stream<String>fruits=Stream.of("Apple","Orange","Lemon","Kiwi");
        fruits.forEach(System.out::println);

        //промежуточные операторы
        //filter()-принимает условие  предикатор и возвращает
        // поток из элементов удовлетворяющих этому условию
        System.out.println("after filter");
        fruits=Stream.of("Apple","Orange","Lemon","Kiwi");
        fruits.filter(f->f.length()==5).forEach(System.out::println);

        System.out.println("==========Car===========");
        Stream<Car> cars=Stream.of(new Car("Mersedes",100000)
                ,new Car("Volvo",80000)
                , new Car("Bentley",500000));
        cars.filter(car->car.getPrice()<200000).forEach(car-> System.out.println(car.getBrand()));
// map()-маппинг, отображение, преобразует элементы потока(из одного типа на другой)
        System.out.println("===========mapping brand==========");
        cars=Stream.of(new Car("Mersedes",100000)
                ,new Car("Volvo",80000)
                , new Car("Bentley",500000));
        cars.filter(car->car.getPrice()<200000)
                .map(Car::getBrand)
                .forEach(System.out::println);
        System.out.println("================================");
        cars=Stream.of(new Car("Mersedes",100000)
                ,new Car("Volvo",80000)
                , new Car("Bentley",500000));
        cars.map(car -> "brand: "+car.getBrand()+"  \nprice: "+car.getPrice())
                .forEach(System.out::println);
//flatMap
        String[] names={"Jack","Ann"};
        Stream<String> streamNames=Arrays.stream(names);
        streamNames.map(str->str.split(" "));

        //sort-сортировка
        System.out.println("===========sort=========");
        List<String> carList=new ArrayList<>();
        carList.add("mersedes");
        carList.add("volvo");
        carList.add("bentley");
        carList.add("opel");

        carList.stream()
                .filter(car->car.length()>4)
                .sorted()
                .forEach(System.out::println);

    }

}
