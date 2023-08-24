package lesson_28.our_interfaces.series;

public class Main {
    public static void main(String[] args) {
        Twice twice=new Twice();
        for(int i=0;i<5;i++){
            System.out.println("next value is"+twice.getNext());
        }
        System.out.println();
        System.out.println(" Reset value");
        twice.reset();
        for(int i=0;i<5;i++){
            System.out.println("next value is"+twice.getNext());
        }
        System.out.println();
        System.out.println("Start at 10");
        twice.setStart(10);
        for(int i=0;i<5;i++){
            System.out.println("next value is"+twice.getNext());
        }
        System.out.println("-----Fourth-----");
        Fourth fourth=new Fourth();
        for(int i=0;i<5;i++){
            System.out.println("next value is"+fourth.getNext());
        }
        Series seriesTwice=new Twice();
        Twice twice1=new Twice();
        Fourth fourth1=new Fourth();


    }
    public  void printSeries(Series series){
        System.out.println(series.getNext());
    }
}
