package homework_11;

public class HomeWork11_2 {
    public static void main(String[] args) {
        powMethod(4);
    }
    public static void powMethod(int x){
        int resoult=1;
        for (int i=0;i<x;i++){
            resoult=resoult*2;
        }
        System.out.println("2 в степени "+x+" равно "+resoult);

    }
}
