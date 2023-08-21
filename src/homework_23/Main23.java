package homework_23;

import lesson_23.Bus;
import lesson_23.BusDriver;

public class Main23 {
    public static void main(String[] args) {
        Bus bus=new Bus("Sprinter",20);
      System.out.println(bus.toString());

       lesson_23.BusDriver driver=new lesson_23.BusDriver("Bob",35);
        System.out.println(driver.toString());

        bus.setDriver(driver);
        System.out.println(bus.toString());

        lesson_23.BusDriver driver1=new BusDriver("Jonn",28);
        Bus bus1=new Bus("vito",12,driver1);
        System.out.println(bus1.toString());
        bus1.setDriver(driver);
        System.out.println(bus1.toString());


    }
}
