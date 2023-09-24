package lesson_48.java_exceptoins;

public class NonIntegerException extends Exception{
    int n;
    int d;

    public NonIntegerException(int n, int d){
        this.n=n;
        this.d=d;
    }
    public String toString(){
        return "res of"+n+"/"+d+"="+n/d;
    }
}
