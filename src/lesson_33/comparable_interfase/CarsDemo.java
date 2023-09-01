package lesson_33.comparable_interfase;

import java.util.Arrays;

public class CarsDemo {

    public static void main(String[] args) {
        Car car1 = new Car("Volvo",2020,30000);
        Car car2 = new Car("Toyota",1990,5000);
        Car car3 = new Car("Audi",2023,150000);
        Car car4 = new Car("Lada",1980,1);

        Car[] cars = {car1,car2,car3,car4};

        Arrays.sort(cars);

        for ( int i = 0; i < cars.length; i++){
            System.out.println(cars[i].toString());
            System.out.println("-----------------------");
        }
    }
}
