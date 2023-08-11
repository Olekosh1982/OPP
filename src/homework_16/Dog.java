package homework_16;

public class Dog {


        String name;
        String color;
        String breed;
        String weight;
        String medals;
        int age=2;

        public Dog(String name,String color,String breed,String weight,String medals,int age){
            this.name="Djem";
            this.color="Gray";
            this.breed="Persian";
            this.weight="7kg";
            this.medals="23";
            this.age = 2;

        }

        void bark() {
            System.out.println("Gav gav !!!");
        }

        void sleep() {
            System.out.println("ррр хррр");
        }

        void runaway(){
            System.out.println("Gav gav !!!");
        }
        void jump() {
            System.out.println("хоп!!");
        }
}
