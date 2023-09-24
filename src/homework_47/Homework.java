package homework_47;

public class Homework {
    public static void main(String[] args) {
       try {
        int x=50/0;

       }catch (ArithmeticException e){
           System.out.println("Divizion by zero is forbidden");
       }
      try{
       String srtNull=null;
       srtNull.toLowerCase();
    }
      catch (NullPointerException e){
          System.out.println("Metod can't be called on null");
      }
      try {
      int[] ints=new int[2];
      ints[10]=90;

      }catch (ArrayIndexOutOfBoundsException e){
          System.out.println(e.getMessage());
      }
      }

}
