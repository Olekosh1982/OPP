package homework_31;

public class HW31 {

    // "Hello world", "l"->3
    public static void main(String[] args) {
        System.out.println( countOccurentces("Hello world","l"));
        System.out.println(countOccurentces("lHellol world","l"));
        System.out.println(countOccurentces("Hello lena","l"));


    }
    public static int countOccurentces(String str,String pattern){
        int count=0;
        int lastIndex=str.lastIndexOf(pattern);
        for (int i=0;i<str.length();i++){
            if(lastIndex!=-1){
                count++;
                lastIndex=str.lastIndexOf(pattern,lastIndex-pattern.length());
            }
        }
        return count;
    }
}
