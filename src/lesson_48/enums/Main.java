package lesson_48.enums;

public class Main {
    public static void main(String[] args) {
        Directions dir=Directions.NORTH;
        System.out.println(dir.getLetter());
        String letterWest=Directions.WEST.getLetter();
        System.out.println(letterWest);
  //  Directions north=Directions.NORTH;
    //    System.out.println(north);
     //   System.out.println(Directions.EAST);
        for(Directions dir23:Directions.values()){

        }
        //    System.out.println(dir);

        //    Directions directions=Directions.WEST;
         //   if (directions==Directions.EAST){
           //     System.out.println("go east");
            //}else  if ()
     //   getDirection(Directions.EAST);
     //   getDirection(Directions.SOUTH);
     //   getDirection(Directions.NORTH);
    //    getDirection(Directions.WEST);
        String east="east";
        Directions eastFormString=Directions.valueOf(east.toUpperCase());
        getDirection(eastFormString);
    }
    public static void  getDirection(Directions direction){
        switch (direction){
            case SOUTH:
                System.out.println("go south");
                break;
            case EAST:
                System.out.println("go east");
                break;
            case WEST:
                System.out.println("go west");
                break;
            case NORTH:
                System.out.println("go north");
                break;
        }
    }

}
