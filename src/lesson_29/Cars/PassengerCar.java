package lesson_29.Cars;

public class PassengerCar extends Car{
    public PassengerCar(String model,
                        String manufacturer,
                        int year,
                        String colour) {
        super(model, manufacturer, year, colour);
    }
    public void  move(){
        System.out.println("i am driving");
    }
    public void  stop(){
        System.out.println("i am stopping");
    }
    public String toString(){
        return "PassengerCar{}"+super.toString();
    }

}
