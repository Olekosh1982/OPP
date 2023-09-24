package lesson_48.java_exceptoins;

public class OurException extends  Exception{
    String string;
    public OurException(String string){
        this.string=string;
    }
    public  String toString(){
        return "OurException";
    }
}
