package lesson_17;

public class Cat {
    String name;
   // int age;
   double weight;
    public Cat(String catName,double weight1){
     this.name=catName;
     this.weight=weight1;
    }
    void  startTraining(int laps){
        System.out.println("Start training s "+laps+" krugami");
        for ( int i=0;i<laps;i++){

                System.out.println("Круг №"+(i+1));
                this.run();
                System.out.println("end lap\n");
        }
    }
    void  run(){
        while (weight<=2){
            System.out.println("Я слишком голоден"+weight);
            eat();
            System.out.println("my weight"+weight);

        }
        System.out.println("Я бегу, ох как тяжело!"+weight);
        weight-=2;
    }
    void  eat(){
        System.out.println("Я покушал!!");
        weight++;
    }
    void whoAmI(){
        System.out.println("Я котик "+name+" и я вешу "+weight);
    }


}
